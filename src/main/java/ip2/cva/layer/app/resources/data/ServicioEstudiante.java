package ip2.cva.layer.app.resources.data;

import org.springframework.stereotype.Service;

import ip2.cva.layer.app.resources.data.generico.AServicioGenerico;
import ip2.cva.layer.app.resources.data.interfaces.IDao;
import ip2.cva.layer.app.resources.data.jpa.DaoJpaGenerico;

@Service("ServicioEstudiante")
public class ServicioEstudiante extends AServicioGenerico<EstudiantePk, EstudianteCuerpo,Estudiante,DaoJpaGenerico<EstudiantePk, EstudianteCuerpo,Estudiante>> {
	   
	public ServicioEstudiante(IDao<EstudiantePk,EstudianteCuerpo,Estudiante> dao) {
		super(dao);
	}
}
