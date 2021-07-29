package com.examen.examenTruper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "USUARIOS_W" )
public class UsuariosModel {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USERNAME",unique=false, nullable = false,columnDefinition = "int default 1")
	@JsonProperty("userName")
	private String userName;
	
	@Column(name = "PASSWORD" )
	@JsonProperty("password")
	private String password;
	
	@Column(name = "ROLE")
	@JsonProperty("role")
	private String role;
	
	@Column(name = "NOMBRE")
	@JsonProperty("nombre")
	private String nombre;
	
	@Column(name = "APELLIDOS")
	@JsonProperty("apellidos")
	private String apellidos;

	public UsuariosModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuariosModel(String userName, String password, String role, String nombre, String apelldidos) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.nombre = nombre;
		this.apellidos = apelldidos;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApelldidos() {
		return apellidos;
	}

	public void setApelldidos(String apelldidos) {
		this.apellidos = apelldidos;
	}
	
	

}
