package karenina.persistencia;

public abstract class GenericService <T extends Entity> implements IFooService <T>{
 
   abstract void setDao(IGenericDao<T> daoToSet );
}