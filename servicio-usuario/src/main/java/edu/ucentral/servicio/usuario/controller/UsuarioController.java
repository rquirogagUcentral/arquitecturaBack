package edu.ucentral.servicio.usuario.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.ucentral.common.usuario.model.Usuario;
import edu.ucentral.commons.service.controller.CommonController;
import edu.ucentral.servicio.usuario.service.UsuarioService;

@RestController
@CrossOrigin({"http://localhost:4200"})
public class UsuarioController extends CommonController<Usuario, UsuarioService> {

	
	  @PutMapping("/{id}") 
	  public ResponseEntity<?> modificar(@Valid @RequestAttribute Usuario usuario,BindingResult result, @PathVariable Long id) { 
		  
		  if(result.hasErrors()) 
		  { 
			  return this.validar(result);
		  } 
		  
		  Optional<Usuario> optional = service.findById(id); 
		  if (!optional.isPresent()) 
		  { 
			  return ResponseEntity.notFound().build(); 
		  }
	  
		  Usuario usuarioBD = optional.get();
		  
		  usuarioBD.setNombre(usuario.getNombre());
		  usuarioBD.setContrasena(usuario.getContrasena());
		  usuarioBD.setCorreo(usuario.getCorreo());
		  usuarioBD.setTelefono(usuario.getTelefono());
		  usuarioBD.setHabilitado(usuario.getHabilitado());
		  usuarioBD.setPerfil(usuario.getPerfil());
		  usuarioBD.setIdEmpresa(usuario.getIdEmpresa()); 
		  return ResponseEntity.status(HttpStatus.CREATED).body(service.save(usuarioBD)); 
	  }
	  
	  @PostMapping("/ingreso")
	  public ResponseEntity<?> ingresar(@RequestBody Usuario usuario,BindingResult result)
	  {
		  return ResponseEntity.ok().body(service.findUserByLogin(usuario.getIdentificacion(), usuario.getContrasena()));
	  }
	
	@GetMapping("/BuscarEmpresa/{id}")
	public ResponseEntity<?> BuscarEmpresa(@PathVariable String id){
		
		return ResponseEntity.ok().body(service.findIdEmpresa(id));
	}
	
}
