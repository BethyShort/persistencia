package ip2.cva.layer.app.resources.data.interfaces;

import java.io.Serializable;

public interface IEntity <J extends IEntityPk, K extends IEntityBody> extends Serializable {
	
	public IEntityPk getClave();
	public IEntityBody getCuerpo();
}
