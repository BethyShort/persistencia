package ip2.cva.layer.app.resources;

import ip2.cva.layer.app.resources.data.Estudiante;
import ip2.cva.layer.app.resources.data.EstudianteCuerpo;
import ip2.cva.layer.app.resources.data.EstudiantePk;
import ip2.cva.layer.app.resources.data.ServicioEstudiante;
import ip2.cva.layer.app.resources.data.dao.provider.jpa.JpaDao;
import ip2.cva.layer.app.resources.data.interfaces.IDao;

public class Prueba {

	public static void main(String[] args) {
		EstudiantePk clave = new EstudiantePk();
		EstudianteCuerpo cuerpo = new EstudianteCuerpo();
		Estudiante estudiante = new Estudiante(clave, cuerpo);

		IDao<EstudiantePk, EstudianteCuerpo, Estudiante> dao = new JpaDao<EstudiantePk, EstudianteCuerpo, Estudiante>();
		ServicioEstudiante servicioEstudiante = new ServicioEstudiante(dao);
		servicioEstudiante.crearEstudiante(estudiante);
		servicioEstudiante.borrarEstudianteByPk(clave);
		servicioEstudiante.obtenerEstudianteByPk(clave);
		servicioEstudiante.actualizarEstudiante(estudiante);
		servicioEstudiante.obtenerTodos();
	}
}
