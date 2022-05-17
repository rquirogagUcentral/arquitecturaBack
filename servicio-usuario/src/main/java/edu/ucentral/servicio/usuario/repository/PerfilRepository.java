package edu.ucentral.servicio.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ucentral.common.usuario.model.Perfil;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {

}
