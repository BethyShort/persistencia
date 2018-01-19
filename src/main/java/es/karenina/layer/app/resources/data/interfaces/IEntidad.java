package es.karenina.layer.app.resources.data.interfaces;

import java.io.Serializable;
import java.util.Map;

public interface IEntidad <J extends IEntidadPk, K extends IEntidadCuerpo> extends Serializable{
	
	IEntidadPk getClave();
	IEntidadCuerpo getCuerpo();
	
	Map<String, Object> getFields();
	Object getFieldValue(String name);
}
