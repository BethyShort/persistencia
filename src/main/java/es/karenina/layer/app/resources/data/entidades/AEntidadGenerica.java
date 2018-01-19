package es.karenina.layer.app.resources.data.entidades;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import es.karenina.layer.app.resources.data.interfaces.IEntidad;
import es.karenina.layer.app.resources.data.interfaces.IEntidadCuerpo;
import es.karenina.layer.app.resources.data.interfaces.IEntidadPk;

public abstract class AEntidadGenerica <J extends IEntidadPk, K extends IEntidadCuerpo> implements IEntidad<J,K>{

	private static final long serialVersionUID = 1L;	
	private J clave;
	private K cuerpo;
	transient private Map<String, Object> values;
	
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
	
	/**
	 * 
	 */
	public Map<String, Object> getFields(){
		Map<String, Object> camposClave=obtenerCampos(clave);
		Map<String, Object> restoCampos=obtenerCampos(cuerpo);
		restoCampos.putAll(camposClave);
		camposClave=null;
		values= restoCampos;
		return values;
	}
	
	public Object getFieldValue(String field) {
		values=getFields();
		return values.get(field);
	}

	private Map<String, Object> obtenerCampos(Serializable value) {
		Map<String, Object> resultado = new HashMap<String, Object>();
		Field[] campos = clave.getClass().getDeclaredFields();
		for (Field campo : campos) {
			boolean incluir = true;
			Object valor=null;
			String nombre=campo.getName();
			campo.setAccessible(true);
			
			if (!nombre.equalsIgnoreCase("serialVersionUID")) {
				try {
					valor = campo.get(value);
				} catch (IllegalArgumentException e) {
					incluir = false;
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					incluir = false;
					e.printStackTrace();
				}
	
				if (valor != null && incluir)
					resultado.put(nombre, valor);
			}
		}
		return resultado;
	}
}
