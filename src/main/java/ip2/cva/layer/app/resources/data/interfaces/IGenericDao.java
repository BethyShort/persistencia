package ip2.cva.layer.app.resources.data.interfaces;

import java.util.List;

public interface IGenericDao <J extends IEntityPk, K extends IEntityBody, T extends IEntity<J,K>>  {

	void setClazz(Class<T> clazzToSet); 
	
	T find(final Long id);

	List<T> findAll();

	void create(final T entity);

	T update(final T entity);

	void delete(final T entity);

	void deleteById(final Long entityId);
}