package karenina.persistencia;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class AbstractHibernateDao< T extends Serializable > implements IGenericDao<T>{
 
   private Class<T> clazz;
 
   @Autowired
   SessionFactory sessionFactory;
 
   public final void setClazz( Class< T > clazzToSet ){
      this.clazz = clazzToSet;
   }
 
   public T find(final Long id ){
      return (T) getCurrentSession().get( clazz, id );
   }
   public List<T> findAll(){
      return getCurrentSession().createQuery( "from " + clazz.getName() ).list();
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