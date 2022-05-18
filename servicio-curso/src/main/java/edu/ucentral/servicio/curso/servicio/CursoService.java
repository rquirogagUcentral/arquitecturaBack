package edu.ucentral.servicio.curso.servicio;

import java.util.List;

import edu.ucentral.common.curso.model.Curso;
import edu.ucentral.common.usuario.model.Usuario;
import edu.ucentral.commons.service.service.CommonService;

public interface CursoService extends CommonService<Curso> {
	public List<Curso> findByDocente(Long id);
}
