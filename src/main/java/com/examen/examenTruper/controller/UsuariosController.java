package com.examen.examenTruper.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examen.examenTruper.Service.IUsuariosRepositoryImpl;
import com.examen.examenTruper.model.UsuariosModel;

@RestController
public class UsuariosController {
	@Autowired
	public IUsuariosRepositoryImpl usuarios;
	
	@GetMapping(value = "/Usuarios",consumes = "application/json", produces = "application/json")
	public List<UsuariosModel> obtienePedidos() {
		return usuarios.getUsuarios();
	}
	
	@GetMapping(value = "/Usuarios/{idUsuario}",consumes = "application/json", produces = "application/json")
	public Optional<UsuariosModel> obtienePedido(@PathVariable("idUsuario") String idUsuario ) {
		return usuarios.getUsuarioId(idUsuario);
	}
	
	@PostMapping(value = "/Usuarios", consumes = "application/json", produces = "application/json")
	public boolean registraPedido(@RequestBody UsuariosModel usuario ) {
		usuarios.setUsuario(usuario);
		return true;
	}

}
