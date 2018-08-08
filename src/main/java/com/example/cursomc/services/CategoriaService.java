package com.example.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cursomc.domain.Categoria;
import com.example.cursomc.repositories.CategoriaRepository;
import com.example.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo; // automaticamente instanciado

	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id); // busca a categoria no banco de dados e joga para o obj
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado Id: " +id + ",Tipo: " + Categoria.class.getName()); //caso id não exista
		}
		return obj;

	}
	public Categoria insert (Categoria obj) {
		return repo.save(obj);
	}

}
