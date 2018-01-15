package karenina.persistencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ServicioEstudiante")
public class ServicioEstudiante extends GenericService<Estudiante> {
	
	IGenericDao <Estudiante> dao;
	   
	public ServicioEstudiante(IGenericDao<Estudiante> daoToSet) {
		setDao(daoToSet);
	}
	@Autowired
	void setDao(IGenericDao<Estudiante> daoToSet) {
		dao = daoToSet;
		dao.setClazz(Estudiante.class);
	}
}
