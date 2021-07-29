package com.examen.examenTruper.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="PEDIDOS_W")
public class PedidosModel {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name ="ID")
	@JsonIgnore
	private Integer id;
	
	@Column(name ="TOTAL")
	@JsonProperty("total")
	private double total;
	
	@Column(name = "DATE_SALE")
	@JsonProperty("fecha")
	private Date dateSale;
	
	@ManyToOne
	@JoinColumn(name = "USERNAME")
	@JsonProperty("username")
	private UsuariosModel userName;

	public PedidosModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PedidosModel(Integer id, double total, Date dateSale, UsuariosModel userName) {
		super();
		this.id = id;
		this.total = total;
		this.dateSale = dateSale;
		this.userName = userName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Date getDateSale() {
		return dateSale;
	}

	public void setDateSale(Date dateSale) {
		this.dateSale = dateSale;
	}

	public UsuariosModel getUserName() {
		return userName;
	}

	public void setUserName(UsuariosModel userName) {
		this.userName = userName;
	}
	
	
}
