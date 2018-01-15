package karenina.persistencia;

public abstract class AbstractEntity <J extends EntityPk, K extends EntityBody> implements Entity{

	private static final long serialVersionUID = 1L;	
	J clave;
	K cuerpo;
	
	public AbstractEntity(J entityPk, K entityBody) {
		clave=entityPk;
		cuerpo=entityBody;
	}
	
	protected J getClave() {
		return clave;
	}

	protected void setClave(J clave) {
		this.clave = clave;
	}

	protected K getCuerpo() {
		return cuerpo;
	}

	protected void setCuerpo(K cuerpo) {
		this.cuerpo = cuerpo;
	}

	protected static long getSerialversionuid() {
		return serialVersionUID;
	}
}
