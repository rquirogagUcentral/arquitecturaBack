package edu.ucentral.servicio.curso.servicio;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import edu.ucentral.common.curso.model.Respuesta;
import edu.ucentral.commons.service.service.CommonServiceImp;
import edu.ucentral.servicio.curso.repository.RespuestaRepository;
@Service
public class RespuestaServiceImp extends CommonServiceImp<Respuesta, RespuestaRepository> implements RespuestaService {

}
