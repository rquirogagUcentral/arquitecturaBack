package edu.ucentral.servicio.curso.servicio;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import edu.ucentral.common.curso.model.Leccion;
import edu.ucentral.commons.service.service.CommonServiceImp;
import edu.ucentral.servicio.curso.repository.LeccionRepository;

public class LeccionServiceImp extends CommonServiceImp<Leccion, LeccionRepository> implements LeccionService {


}
