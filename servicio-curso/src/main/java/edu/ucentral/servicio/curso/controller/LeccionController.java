package edu.ucentral.servicio.curso.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ucentral.common.curso.model.Leccion;
import edu.ucentral.common.curso.model.Respuesta;
import edu.ucentral.commons.service.controller.CommonController;
import edu.ucentral.servicio.curso.servicio.LeccionService;

@RestController
@RequestMapping("leccion")
public class LeccionController extends CommonController<Leccion, LeccionService> {

	@PutMapping("/{id}/add-respuestas")
	public ResponseEntity<?> adicionarRespuestas(@Valid @RequestBody Respuesta itemrespuesta, BindingResult result, @PathVariable Long id){
		if(result.hasErrors()) {
			return this.validar(result);
		}
		Optional<Leccion> optional = service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		Leccion LeccionBD = optional.get();
		
		LeccionBD.addRespuesta(itemrespuesta);
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(LeccionBD));
	}

	@PutMapping("/{id}/remove-respuestas")
	public ResponseEntity<?> removerRespuestas(@Valid @RequestBody Respuesta itemrespuesta, BindingResult result, @PathVariable Long id){
		if(result.hasErrors()) {
			return this.validar(result);
		}
		Optional<Leccion> optional = service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		Leccion LeccionBD = optional.get();
		LeccionBD.removerRespuesta(itemrespuesta);
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(LeccionBD));
	}
	
}
