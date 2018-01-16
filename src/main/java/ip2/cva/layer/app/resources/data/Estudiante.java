package ip2.cva.layer.app.resources.data;

public class Estudiante extends AEntity<EstudiantePk, EstudianteBody>{
	
	public Estudiante(EstudiantePk pk, EstudianteBody body) {
		super(pk,body);
	}

	private static final long serialVersionUID = 1L;
}
