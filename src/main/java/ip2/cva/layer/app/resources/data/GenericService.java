package ip2.cva.layer.app.resources.data;

import ip2.cva.layer.app.resources.data.interfaces.IEntity;
import ip2.cva.layer.app.resources.data.interfaces.IGenericDao;
import ip2.cva.layer.app.resources.data.interfaces.IService;

public abstract class GenericService <T extends IEntity> implements IService <T>{
 
   abstract void setDao(IGenericDao<T> daoToSet );
}