package edu.ucentral.servicio.curso.servicio;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import edu.ucentral.common.curso.model.Respuesta;
import edu.ucentral.commons.service.service.CommonServiceImp;
import edu.ucentral.servicio.curso.repository.RespuestaRepository;

public class RespuestaServiceImp extends CommonServiceImp<Respuesta, RespuestaRepository> implements RespuestaService {

}
