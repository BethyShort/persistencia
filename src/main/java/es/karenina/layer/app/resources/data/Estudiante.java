package es.karenina.layer.app.resources.data;

import es.karenina.layer.app.resources.data.entidades.AEntidadGenerica;

public class Estudiante extends AEntidadGenerica<EstudiantePk, EstudianteCuerpo>{
	
	public Estudiante(EstudiantePk pk, EstudianteCuerpo body) {
		super(pk,body);
	}

	private static final long serialVersionUID = 1L;
}
