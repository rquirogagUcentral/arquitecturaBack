package edu.ucentral.servicio.usuario.service;

import java.util.List;

import edu.ucentral.common.usuario.model.Usuario;
import edu.ucentral.commons.service.service.CommonService;

public interface UsuarioService extends CommonService<Usuario> {
	public List<Usuario> findIdEmpresa(String id);
	public Usuario findUserByLogin(String id, String contrasena);
	
}
