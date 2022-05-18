package edu.ucentral.servicio.curso.servicio;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import edu.ucentral.common.curso.model.TipoCurso;
import edu.ucentral.commons.service.service.CommonServiceImp;
import edu.ucentral.servicio.curso.repository.TipoCursoRepository;
@Service
public class TipoCursoServiceImp extends CommonServiceImp<TipoCurso, TipoCursoRepository> implements TipoCursoService {

}
