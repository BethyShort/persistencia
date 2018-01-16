package ip2.cva.layer.app.provider.data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ip2.cva.layer.app.resources.data.interfaces.IEntity;
import ip2.cva.layer.app.resources.data.interfaces.IEntityBody;
import ip2.cva.layer.app.resources.data.interfaces.IEntityPk;
import ip2.cva.layer.app.resources.data.jpa.AJpaDao;

@Repository
public class GenericHibernateDao <J extends IEntityPk, K extends IEntityBody, T extends IEntity<J,K>> extends AJpaDao<J,K,T> {
	 
	   private T clazz;
	 
	   @Autowired
	   SessionFactory sessionFactory;
	 
	 
	   public T find(final Long id ){
	      return (T) getCurrentSession().get(clazz.getClass(), id);
	   }
	   public List<T> findAll(){
	      return getCurrentSession().createQuery( "from " + clazz.getClass().getName()).list();
	   }
	 
	   public void create(final T entity ){
	      getCurrentSession().persist( entity );
	   }
	 
	   public T update(final T entity ){
	      return (T) getCurrentSession().merge( entity );
	   }
	 
	   public void delete(final  T entity ){
	      getCurrentSession().delete( entity );
	   }
	   public void deleteById(final Long entityId ) {
	      T entity = find( entityId );
	      delete( entity );
	   }
	 
	   protected final Session getCurrentSession() {
	      return sessionFactory.getCurrentSession();
	   }
}