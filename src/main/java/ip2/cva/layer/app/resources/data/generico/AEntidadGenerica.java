package ip2.cva.layer.app.resources.data;

import ip2.cva.layer.app.resources.data.interfaces.IEntity;
import ip2.cva.layer.app.resources.data.interfaces.IEntityBody;
import ip2.cva.layer.app.resources.data.interfaces.IEntityPk;

public abstract class AEntity <J extends IEntityPk, K extends IEntityBody> implements IEntity<J,K>{

	private static final long serialVersionUID = 1L;	
	private J clave;
	private K cuerpo;
	
	public AEntity(J entityPk, K entityBody) {
		clave=entityPk;
		cuerpo=entityBody;
	}
	
	public J getClave() {
		return clave;
	}

	public K getCuerpo() {
		return cuerpo;
	}

	protected static long getSerialversionuid() {
		return serialVersionUID;
	}
}
