package es.karenina.layer.app.resources.data.interfaces;

import java.util.List;

public interface IDao <J extends IEntidadPk, K extends IEntidadCuerpo, T extends IEntidad<J,K>>  {

	void setClazz(Class<T> clazzToSet); 
	
	T findByPk(final J pk);

	List<T> findAll();

	void create(final T entity);

	T update(final T entity);

	void delete(final T entity);

	void deleteByPk(final J pk);
}