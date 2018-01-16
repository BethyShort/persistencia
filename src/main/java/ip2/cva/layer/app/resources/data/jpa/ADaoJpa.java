package ip2.cva.layer.app.resources.data.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ip2.cva.layer.app.resources.data.interfaces.IEntidad;
import ip2.cva.layer.app.resources.data.interfaces.IEntidadCuerpo;
import ip2.cva.layer.app.resources.data.interfaces.IEntidadPk;
import ip2.cva.layer.app.resources.data.interfaces.IDao;

public abstract class ADaoJpa <J extends IEntidadPk, K extends IEntidadCuerpo, L extends IEntidad<J,K>>  implements IDao<J,K,L> {

	private Class<L> clazz;

	@PersistenceContext
	EntityManager entityManager;

	public void setClazz(Class<L> clazzToSet) {
		this.clazz = clazzToSet;
	}

	public L findByPk(final J pk) {
		return entityManager.find(clazz, pk);
	}

	public List<L> findAll() {
		return entityManager.createQuery("from " + clazz.getName()).getResultList();
	}

	public void create(final L entity) {
		entityManager.persist(entity);
	}

	public L update(final L entity) {
		return entityManager.merge(entity);
	}

	public void delete(final L entity) {
		entityManager.remove(entity);
	}

	public void deleteByPk(final J pk) {
		L entity = findByPk(pk);
		delete(entity);
	}
}