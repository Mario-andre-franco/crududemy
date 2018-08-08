package com.example.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cursomc.domain.Pedido;
import com.example.cursomc.repositories.PedidoRepository;
import com.example.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo; // automaticamente instanciado

	public Pedido buscar(Integer id) {

		
		Pedido obj = repo.findOne(id); // busca a categoria no banco de dados e joga para o obj
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado Id: " +id + ",Tipo: " + Pedido.class.getName()); //caso id não exista
		}
		return obj;

	}

}
