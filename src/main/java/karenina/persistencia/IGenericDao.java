package karenina.persistencia;

import java.io.Serializable;
import java.util.List;

public interface IGenericDao<T extends Serializable> {

	void setClazz(Class<T> clazzToSet); 
	
	T find(final Long id);

	List<T> findAll();

	void create(final T entity);

	T update(final T entity);

	void delete(final T entity);

	void deleteById(final Long entityId);
}