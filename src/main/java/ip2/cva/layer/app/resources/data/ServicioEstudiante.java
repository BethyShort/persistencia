package ip2.cva.layer.app.resources.data;

import org.springframework.stereotype.Service;

import ip2.cva.layer.app.resources.data.interfaces.IGenericDao;

@Service("ServicioEstudiante")
public class ServicioEstudiante extends GenericService<EstudiantePk, EstudianteBody,Estudiante> {
	   
	public ServicioEstudiante(IGenericDao<EstudiantePk,EstudianteBody,Estudiante> dao) {
		super(dao);
	}
}
