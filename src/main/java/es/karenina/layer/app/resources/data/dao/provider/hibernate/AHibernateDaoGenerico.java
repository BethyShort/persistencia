package es.karenina.layer.app.resources.data.dao.provider.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import es.karenina.layer.app.resources.data.interfaces.IDao;
import es.karenina.layer.app.resources.data.interfaces.IEntidad;
import es.karenina.layer.app.resources.data.interfaces.IEntidadCuerpo;
import es.karenina.layer.app.resources.data.interfaces.IEntidadPk;

/**
 * Se elimina la implemenación original, porque Hibernate es una implementación
 * de JPA y debería compartir interfaz con todas las implementaciones JPA.
 *
 * @param <J>
 * @param <K>
 * @param <T>
 */
public abstract class AHibernateDaoGenerico<J extends IEntidadPk, K extends IEntidadCuerpo, L extends IEntidad<J, K>>
		implements IDao<J, K, L> {

	private Class<L> clazz;

	@Autowired
	SessionFactory sessionFactory;

	public final L findByPk(final J pk) {
		return (L) getCurrentSession().get(clazz, pk);
	}

	public final List<L> findAll() {
		return getCurrentSession().createQuery("from " + clazz.getName()).list();
	}

	public final void create(final L newEntity) {
		getCurrentSession().persist(newEntity);
	}

	public final L update(final L persistent) {
		return (L) getCurrentSession().merge(persistent);
	}

	public final void delete(final L persistent) {
		getCurrentSession().delete(persistent);
	}

	public void deleteByPk(final J pk) {
		L entity = findByPk(pk);
		delete(entity);
	}

	protected final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setClazz(Class<L> clazzToSet) {
		clazz = clazzToSet;
	}

}