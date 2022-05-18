package edu.ucentral.servicio.curso.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import edu.ucentral.common.curso.model.Curso;
import edu.ucentral.common.usuario.model.Usuario;
import edu.ucentral.commons.service.service.CommonServiceImp;
import edu.ucentral.servicio.curso.repository.CursoRepository;
@Service
public class CursoServiceImp extends CommonServiceImp<Curso, CursoRepository> implements CursoService {

	@Override
	public List<Curso> findByDocente(Long id) {
		return repository.findByDocente(id);
	}


}
