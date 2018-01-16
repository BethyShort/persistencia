package ip2.cva.layer.app.resources.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ip2.cva.layer.app.resources.data.interfaces.IGenericDao;

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
