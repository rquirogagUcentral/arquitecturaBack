package edu.ucentral.servicio.usuario.controller;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ucentral.common.usuario.model.Perfil;
import edu.ucentral.commons.service.controller.CommonController;
import edu.ucentral.servicio.usuario.service.PerfilService;

@RestController
@RequestMapping("perfil")
@CrossOrigin({"http://localhost:4200"})
public class PerfilController extends CommonController<Perfil, PerfilService> {

}
