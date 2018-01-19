package es.karenina.layer.app.resources.data;

import es.karenina.layer.app.resources.data.interfaces.IEntidadPk;

public class EstudiantePk implements IEntidadPk {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9086773471340472838L;

	protected String campoPrimero;
	
	protected String campoSegundo;
	
	public String getCampoPrimero() {
		return campoPrimero;
	}
	public void setCampoPrimero(String campoPrimero) {
		this.campoPrimero = campoPrimero;
	}
	
	public String getCampoSegundo() {
		return campoSegundo;
	}
	public void setCampoSegundo(String campoSegundo) {
		this.campoSegundo = campoSegundo;
	}
}
