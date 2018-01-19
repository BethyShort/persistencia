package es.karenina.layer.app.resources.data.dao.provider.jpa;

import org.springframework.stereotype.Repository;

import es.karenina.layer.app.resources.data.interfaces.IEntidad;
import es.karenina.layer.app.resources.data.interfaces.IEntidadCuerpo;
import es.karenina.layer.app.resources.data.interfaces.IEntidadPk;

@Repository
public class JpaDao <J extends IEntidadPk, K extends IEntidadCuerpo,T extends IEntidad<J,K>> extends AJpaDaoGenerico<J,K,T>{
	
	
}
