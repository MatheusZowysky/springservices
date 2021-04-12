package br.edu.zowysky.ShowCars.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.zowysky.ShowCars.domain.Categoria;
import br.edu.zowysky.ShowCars.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	/*@GetMapping
	public List<Categoria> listar(){
		List<Categoria> categoria = categoriaRepository.findAll();
		return categoria;
		
	}
	*/
	@DeleteMapping("/{codigo}")
	public Categoria excluir(@PathVariable Short codigo) {
		Optional<Categoria> categoria = categoriaRepository.findById(codigo);
		categoriaRepository.delete(categoria.get());
		Categoria categoriaRetorno = categoria.get();
		return categoriaRetorno;
	}
	
	
	

}
