package ip2.cva.layer.app.resources.data;

import ip2.cva.layer.app.resources.data.interfaces.IEntity;
import ip2.cva.layer.app.resources.data.interfaces.IEntityBody;
import ip2.cva.layer.app.resources.data.interfaces.IEntityPk;
import ip2.cva.layer.app.resources.data.interfaces.IGenericDao;
import ip2.cva.layer.app.resources.data.interfaces.IService;

public abstract class GenericService <J extends IEntityPk, K extends IEntityBody, T extends IEntity<J,K>> implements IService <J,K,T>{
 
	private IGenericDao<J,K,T> dao;
	
	public GenericService(IGenericDao<J,K,T> value) {
		dao=value;
	}
	
}