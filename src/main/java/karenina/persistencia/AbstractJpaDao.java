package karenina.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractJpaDao <T extends Entity>  implements IGenericDao<T> {

	private Class<T> clazz;

	@PersistenceContext
	EntityManager entityManager;

	public void setClazz(Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}

	public T find(final Long id) {
		return entityManager.find(clazz, id);
	}

	public List<T> findAll() {
		return entityManager.createQuery("from " + clazz.getName()).getResultList();
	}

	public void create(final T entity) {
		entityManager.persist(entity);
	}

	public T update(final T entity) {
		return entityManager.merge(entity);
	}

	public void delete(final T entity) {
		entityManager.remove(entity);
	}

	public void deleteById(final Long entityId) {
		T entity = find(entityId);
		delete(entity);
	}
}