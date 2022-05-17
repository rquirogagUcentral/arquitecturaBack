package edu.ucentral.servicio.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ucentral.common.curso.model.TipoCurso;

public interface TipoCursoRepository extends JpaRepository<TipoCurso, Long> {

}
