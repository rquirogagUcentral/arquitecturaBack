package edu.ucentral.servicio.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ucentral.common.curso.model.Respuesta;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {

}
