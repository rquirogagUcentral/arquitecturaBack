package edu.ucentral.servicio.usuario.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import edu.ucentral.common.usuario.model.Perfil;
import edu.ucentral.commons.service.service.CommonServiceImp;
import edu.ucentral.servicio.usuario.repository.PerfilRepository;
@Service
public class PerfilServiceImp extends CommonServiceImp<Perfil, PerfilRepository> implements PerfilService {


}
