package ip2.cva.layer.app.resources.data.interfaces;

import java.io.Serializable;

public interface IEntidad <J extends IEntidadPk, K extends IEntidadCuerpo> extends Serializable{
	
	public IEntidadPk getClave();
	public IEntidadCuerpo getCuerpo();
}
