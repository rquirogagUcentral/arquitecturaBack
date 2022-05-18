package edu.ucentral.servicio.curso.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ucentral.common.curso.model.TipoCurso;
import edu.ucentral.commons.service.controller.CommonController;
import edu.ucentral.servicio.curso.servicio.TipoCursoService;

@RestController
@RequestMapping("tipo-curso")
public class TipoCursoController extends CommonController<TipoCurso, TipoCursoService> {

}
