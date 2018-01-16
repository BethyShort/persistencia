package ip2.cva.layer.app.provider.data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ip2.cva.layer.app.resources.data.interfaces.IEntidad;
import ip2.cva.layer.app.resources.data.interfaces.IEntidadCuerpo;
import ip2.cva.layer.app.resources.data.interfaces.IEntidadPk;
import ip2.cva.layer.app.resources.data.interfaces.IDao;

/**
 * Se elimina la implemenación original, porque Hibernate es una implementación
 * de JPA y debería compartir interfaz con todas las implementaciones JPA.
 *
 * @param <J>
 * @param <K>
 * @param <T>
 */
public abstract class ADaoHibernate<J extends IEntidadPk, K extends IEntidadCuerpo, L extends IEntidad<J, K>>
		implements IDao<J, K, L> {

	private Class<L> clazz;

	@Autowired
	SessionFactory sessionFactory;

	public L findByPk(final J pk) {
		return (L) getCurrentSession().get(clazz, pk);
	}

	public List<L> findAll() {
		return getCurrentSession().createQuery("from " + clazz.getName()).list();
	}

	public void create(final L newEntity) {
		getCurrentSession().persist(newEntity);
	}

	public L update(final L persistent) {
		return (L) getCurrentSession().merge(persistent);
	}

	public void delete(final L persistent) {
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