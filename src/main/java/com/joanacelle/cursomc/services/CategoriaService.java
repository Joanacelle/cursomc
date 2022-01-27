package com.joanacelle.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joanacelle.cursomc.domain.Categoria;
import com.joanacelle.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		java.util.Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
