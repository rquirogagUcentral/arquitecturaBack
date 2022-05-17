package edu.ucentral.servicio.curso.servicio;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import edu.ucentral.common.curso.model.Curso;
import edu.ucentral.commons.service.service.CommonServiceImp;
import edu.ucentral.servicio.curso.repository.CursoRepository;

public class CursoServiceImp extends CommonServiceImp<Curso, CursoRepository> implements CursoService {


}
