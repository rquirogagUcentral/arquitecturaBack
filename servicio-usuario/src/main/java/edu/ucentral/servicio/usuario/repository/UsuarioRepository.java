package edu.ucentral.servicio.usuario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.ucentral.common.usuario.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	@Query ("SELECT e FROM Usuario e WHERE e.idEmpresa= ?1")
	public List<Usuario> findByIdEmpresa(String idEmpresa);
	
	//@Query ("Select u FROM Usuario u WHERE u.identificacion= ? AND u.contrasena = ?")
	public Usuario findByIdentificacionAndContrasena(String identificacion, String contrasena);
}
