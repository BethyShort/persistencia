package ip2.cva.layer.app.resources.data;

import ip2.cva.layer.app.resources.data.entidades.AEntidadGenerica;

public class Estudiante extends AEntidadGenerica<EstudiantePk, EstudianteCuerpo>{
	
	public Estudiante(EstudiantePk pk, EstudianteCuerpo body) {
		super(pk,body);
	}

	private static final long serialVersionUID = 1L;
}
