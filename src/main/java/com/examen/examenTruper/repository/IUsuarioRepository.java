package com.examen.examenTruper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.examenTruper.model.UsuariosModel;

public interface IUsuarioRepository extends JpaRepository<UsuariosModel, String> {

}
