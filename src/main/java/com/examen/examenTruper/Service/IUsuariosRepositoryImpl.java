package com.examen.examenTruper.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examenTruper.model.UsuariosModel;
import com.examen.examenTruper.repository.IUsuarioRepository;

@Service
public class IUsuariosRepositoryImpl {
	
	@Autowired
	public IUsuarioRepository usuarios;
	
	public List<UsuariosModel> getUsuarios() {
		return usuarios.findAll();
	}
	
	public Optional<UsuariosModel> getUsuarioId(String idUsuario) {
		return usuarios.findById(idUsuario);
	}
	
	public void setUsuario(UsuariosModel usuarioIngresar) {
		usuarios.save(usuarioIngresar);
	}

}
