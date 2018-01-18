package ip2.cva.layer.app.resources.data.dao.provider.jpa;

import org.springframework.stereotype.Repository;

import ip2.cva.layer.app.resources.data.interfaces.IEntidad;
import ip2.cva.layer.app.resources.data.interfaces.IEntidadCuerpo;
import ip2.cva.layer.app.resources.data.interfaces.IEntidadPk;

@Repository
public class JpaDao <J extends IEntidadPk, K extends IEntidadCuerpo,T extends IEntidad<J,K>> extends AJpaDaoGenerico<J,K,T>{
	
	
}
