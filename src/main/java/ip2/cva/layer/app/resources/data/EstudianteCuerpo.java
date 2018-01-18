package ip2.cva.layer.app.resources.data;

import ip2.cva.layer.app.resources.data.interfaces.IEntidadCuerpo;

public class EstudianteCuerpo implements IEntidadCuerpo {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3745297387350501175L;
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
