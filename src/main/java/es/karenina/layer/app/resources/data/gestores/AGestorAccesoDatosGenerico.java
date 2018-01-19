package es.karenina.layer.app.resources.data.gestores;

import es.karenina.layer.app.resources.data.interfaces.IDao;
import es.karenina.layer.app.resources.data.interfaces.IEntidad;
import es.karenina.layer.app.resources.data.interfaces.IEntidadCuerpo;
import es.karenina.layer.app.resources.data.interfaces.IEntidadPk;
import es.karenina.layer.app.resources.data.interfaces.IGestorAccesoDatos;

public abstract class AGestorAccesoDatosGenerico <J extends IEntidadPk, K extends IEntidadCuerpo, L extends IEntidad<J,K>, M extends IDao<J,K,L>> implements IGestorAccesoDatos <J,K,L,M>{
 
	private IDao<J,K,L> dao;
	
	public AGestorAccesoDatosGenerico(IDao<J,K,L> value) {
		dao=value;
	}

	public IDao<J, K, L> getDao() {
		return dao;
	}
}