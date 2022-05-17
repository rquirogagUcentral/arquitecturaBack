package edu.ucentral.servicio.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ucentral.common.curso.model.Leccion;

public interface LeccionRepository extends JpaRepository<Leccion, Long> {

}
