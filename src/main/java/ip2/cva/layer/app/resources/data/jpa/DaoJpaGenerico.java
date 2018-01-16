package ip2.cva.layer.app.resources.data.jpa;

import org.springframework.stereotype.Repository;

import ip2.cva.layer.app.resources.data.interfaces.IEntidad;
import ip2.cva.layer.app.resources.data.interfaces.IEntidadCuerpo;
import ip2.cva.layer.app.resources.data.interfaces.IEntidadPk;

@Repository
public class DaoJpaGenerico <J extends IEntidadPk, K extends IEntidadCuerpo,T extends IEntidad<J,K>> extends ADaoJpa<J,K,T>{
	
}