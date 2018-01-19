package es.karenina.layer.app.resources;

import es.karenina.layer.app.resources.data.Estudiante;
import es.karenina.layer.app.resources.data.EstudianteCuerpo;
import es.karenina.layer.app.resources.data.EstudiantePk;
import es.karenina.layer.app.resources.data.ServicioEstudiante;
import es.karenina.layer.app.resources.data.dao.provider.jpa.JpaDao;
import es.karenina.layer.app.resources.data.interfaces.IDao;

public class Prueba {

	public static void main(String[] args) {
		EstudiantePk clave = new EstudiantePk();
		EstudianteCuerpo cuerpo = new EstudianteCuerpo();
		Estudiante estudiante = new Estudiante(clave, cuerpo);
		
		clave.setCampoPrimero("valor campo primer");
		clave.setCampoSegundo("valor campo segundo");
		cuerpo.setCampoPrimero("valor campo primero");
		cuerpo.setCampoSegundo("valor campo segundo");

		estudiante.getFields();

		IDao<EstudiantePk, EstudianteCuerpo, Estudiante> dao = new JpaDao<EstudiantePk, EstudianteCuerpo, Estudiante>();
		ServicioEstudiante servicioEstudiante = new ServicioEstudiante(dao);
		servicioEstudiante.crearEstudiante(estudiante);
		servicioEstudiante.borrarEstudianteByPk(clave);
		servicioEstudiante.obtenerEstudianteByPk(clave);
		servicioEstudiante.actualizarEstudiante(estudiante);
		servicioEstudiante.obtenerTodos();
	}
}
