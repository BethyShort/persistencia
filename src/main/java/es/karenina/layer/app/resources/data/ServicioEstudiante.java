package es.karenina.layer.app.resources.data;

import java.util.List;

import org.springframework.stereotype.Service;

import es.karenina.layer.app.resources.data.gestores.AGestorAccesoDatosGenerico;
import es.karenina.layer.app.resources.data.interfaces.IDao;

@Service("ServicioEstudiante")
public class ServicioEstudiante extends AGestorAccesoDatosGenerico<EstudiantePk, EstudianteCuerpo,Estudiante,IDao<EstudiantePk, EstudianteCuerpo,Estudiante>> {
	   
	public ServicioEstudiante(IDao<EstudiantePk,EstudianteCuerpo,Estudiante> dao) {
		super(dao);
	}
	
	public Estudiante obtenerEstudianteByPk(final EstudiantePk pk) {
		return super.getDao().findByPk(pk);
	}

	public List<Estudiante> obtenerTodos() {
		return super.getDao().findAll();
	}

	public void crearEstudiante(final Estudiante entity) {
		super.getDao().create(entity);
	}

	public Estudiante actualizarEstudiante(final Estudiante entity) {
		return super.getDao().update(entity);
	}

	public void borrarEstudianteByPk(final EstudiantePk pk) {
		super.getDao().deleteByPk(pk);
	}
}
