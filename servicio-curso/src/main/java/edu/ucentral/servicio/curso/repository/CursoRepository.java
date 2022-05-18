package edu.ucentral.servicio.curso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.ucentral.common.curso.model.Curso;
import edu.ucentral.common.usuario.model.Usuario;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	@Query("SELECT e FROM Curso e WHERE e.docente.id= ?1")
	public List<Curso> findByDocente(Long id);

}
