package edu.ucentral.servicio.curso.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.ucentral.common.curso.model.Curso;
import edu.ucentral.common.curso.model.Leccion;
import edu.ucentral.common.usuario.model.Usuario;
import edu.ucentral.commons.service.controller.CommonController;
import edu.ucentral.servicio.curso.repository.CursoRepository;
import edu.ucentral.servicio.curso.servicio.CursoService;

@RestController
public class CursoController extends CommonController<Curso, CursoService>{

	@PutMapping("/{id}/add-leccion")
	public ResponseEntity<?> adicionarLeccion(@Valid @RequestBody Leccion itemLeccion, BindingResult result, @PathVariable Long id){
		if(result.hasErrors()) {
			return this.validar(result);
		}
		Optional<Curso> optional = service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		Curso CursoBD = optional.get();
		CursoBD.addLecciones(itemLeccion);
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(CursoBD));
	}
	
	
	@PutMapping("/{id}/remove-leccion")
	public ResponseEntity<?> removerLeccion(@Valid @RequestBody Leccion itemLeccion, BindingResult result, @PathVariable Long id){
		if(result.hasErrors()) {
			return this.validar(result);
		}
		Optional<Curso> optional = service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		Curso CursoBD = optional.get();
		CursoBD.removeLecciones(itemLeccion);
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(CursoBD));
	}
	
	@GetMapping("/docente/{id}")
	public ResponseEntity<?> buscarPorDocente(@PathVariable Long id)
	{
		return ResponseEntity.ok().body(service.findByDocente(id));
	}
	
	@PutMapping("/{id}/add-estudiante")
	public ResponseEntity<?> adicionarestudiante(@Valid @RequestBody Usuario itemEstudiante, BindingResult result, @PathVariable Long id){
		if(result.hasErrors()) {
			return this.validar(result);
		}
		Optional<Curso> optional = service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		Curso CursoBD = optional.get();
		CursoBD.addEstudiantes(itemEstudiante);
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(CursoBD));
	}
}
