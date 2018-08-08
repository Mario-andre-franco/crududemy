package com.example.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cursomc.domain.Cliente;
import com.example.cursomc.repositories.ClienteRepository;
import com.example.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo; // automaticamente instanciado

	public Cliente buscar(Integer id) {

		
		Cliente obj = repo.findOne(id); // busca a categoria no banco de dados e joga para o obj
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado Id: " +id + ",Tipo: " + Cliente.class.getName()); //caso id não exista
		}
		return obj;

	}

}
