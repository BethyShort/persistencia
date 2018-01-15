package karenina.persistencia;

import org.springframework.stereotype.Service;

@Service ("FooDao")
public abstract class GenericService <T extends Entity> implements IFooService <T>{
 
   abstract void setDao(IGenericDao<T> daoToSet );
}