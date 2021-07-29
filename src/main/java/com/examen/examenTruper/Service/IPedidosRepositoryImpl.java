package com.examen.examenTruper.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examenTruper.model.PedidosModel;
import com.examen.examenTruper.repository.IPedidosRepository;

@Service
public class IPedidosRepositoryImpl {
	@Autowired
	public IPedidosRepository pedidos;
	
	public List<PedidosModel> getPedidos() {
		return pedidos.findAll();
	}
	
	public Optional<PedidosModel> getPedidoId(Integer idPedido) {
		return pedidos.findById(idPedido);
	}
	
	public void setPedido(PedidosModel pedidoIngresar) {
		pedidos.save(pedidoIngresar);
	}

}
