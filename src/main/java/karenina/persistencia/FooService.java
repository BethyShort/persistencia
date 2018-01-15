package karenina.persistencia;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service ("FooDao")
class FooService <T extends Serializable> implements IFooService <T>{
 
   IGenericDao<Foo> dao;
 
   @Autowired
   public void setDao( IGenericDao< Foo > daoToSet ){
      dao = daoToSet;
      dao.setClazz( Foo.class );
   }
}