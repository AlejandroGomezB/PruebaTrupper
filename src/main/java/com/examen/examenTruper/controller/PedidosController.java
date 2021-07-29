package com.examen.examenTruper.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examen.examenTruper.Service.IPedidosRepositoryImpl;
import com.examen.examenTruper.model.PedidosModel;

@RestController
public class PedidosController {
	@Autowired
	public IPedidosRepositoryImpl pedidos;
	
	@GetMapping(value= "/",consumes = "application/json", produces = "application/json")
	public String index() {
		return "Hola Mundo";
	}
	
	@GetMapping(value = "/Pedidos",consumes = "application/json", produces = "application/json")
	public List<PedidosModel> obtienePedidos() {
		return pedidos.getPedidos();
	}
	
	@GetMapping(value="/Pedidos/{idPedido}",consumes = "application/json", produces = "application/json")
	public Optional<PedidosModel> obtienePedido(@PathVariable("idPedido") int idPedido ) {
		return pedidos.getPedidoId(idPedido);
	}
	
	@PostMapping(value="/Pedidos",consumes = "application/json", produces = "application/json")
	public boolean registraPedido(@RequestBody PedidosModel pedido ) {
		pedidos.setPedido(pedido);
		return true;
	}
	

}
