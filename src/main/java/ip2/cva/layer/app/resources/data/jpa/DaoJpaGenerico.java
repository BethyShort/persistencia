package ip2.cva.layer.app.resources.data.jpa;

import org.springframework.stereotype.Repository;

import ip2.cva.layer.app.resources.data.interfaces.IEntity;
import ip2.cva.layer.app.resources.data.interfaces.IEntityBody;
import ip2.cva.layer.app.resources.data.interfaces.IEntityPk;

@Repository
public class GenericJpaDao <J extends IEntityPk, K extends IEntityBody,T extends IEntity<J,K>> extends AJpaDao<J,K,T>{
	
}