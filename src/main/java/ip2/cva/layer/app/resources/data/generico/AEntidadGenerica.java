package ip2.cva.layer.app.resources.data.generico;

import ip2.cva.layer.app.resources.data.interfaces.IEntidad;
import ip2.cva.layer.app.resources.data.interfaces.IEntidadCuerpo;
import ip2.cva.layer.app.resources.data.interfaces.IEntidadPk;

public abstract class AEntidadGenerica <J extends IEntidadPk, K extends IEntidadCuerpo> implements IEntidad<J,K>{

	private static final long serialVersionUID = 1L;	
	private J clave;
	private K cuerpo;
	
	public AEntidadGenerica(J entityPk, K entityBody) {
		clave=entityPk;
		cuerpo=entityBody;
	}
	
	public final J getClave() {
		return clave;
	}

	public final K getCuerpo() {
		return cuerpo;
	}

	protected static long getSerialversionuid() {
		return serialVersionUID;
	}
}
