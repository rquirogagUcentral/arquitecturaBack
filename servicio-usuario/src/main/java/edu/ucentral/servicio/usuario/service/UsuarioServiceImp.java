package edu.ucentral.servicio.usuario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import edu.ucentral.common.usuario.model.Usuario;
import edu.ucentral.commons.service.service.CommonServiceImp;
import edu.ucentral.servicio.usuario.repository.UsuarioRepository;

@Service
public class UsuarioServiceImp extends CommonServiceImp<Usuario, UsuarioRepository> implements UsuarioService {

	@Override
	public List<Usuario> findIdEmpresa(String id) {
		// TODO Auto-generated method stub
		return repository.findByIdEmpresa(id);
	}
	
	@Override
	public Usuario findUserByLogin(String id, String contrasena) {
		// TODO Auto-generated method stub
		return repository.findByIdentificacionAndContrasena(id, contrasena);
	}

}
