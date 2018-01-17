package ip2.cva.layer.app.resources.data.generico;

import ip2.cva.layer.app.resources.data.interfaces.IEntidad;
import ip2.cva.layer.app.resources.data.interfaces.IEntidadCuerpo;
import ip2.cva.layer.app.resources.data.interfaces.IEntidadPk;
import ip2.cva.layer.app.resources.data.interfaces.IDao;
import ip2.cva.layer.app.resources.data.interfaces.IServicio;

public abstract class AServicioGenerico <J extends IEntidadPk, K extends IEntidadCuerpo, L extends IEntidad<J,K>, M extends IDao<J,K,L>> implements IServicio <J,K,L,M>{
 
	private IDao<J,K,L> dao;
	
	public AServicioGenerico(IDao<J,K,L> value) {
		dao=value;
	}

	public IDao<J, K, L> getDao() {
		return dao;
	}
}