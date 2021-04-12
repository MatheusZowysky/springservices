package br.edu.zowysky.ShowCars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.zowysky.ShowCars.domain.Veiculos;
import br.edu.zowysky.ShowCars.repository.VeiculosRepository;

@RestController
@RequestMapping("/veiculos") 
public class VeiculosController {
	@Autowired
	private VeiculosRepository veiculosRepository;
	@GetMapping
	public List<Veiculos> listar(){
		List<Veiculos> veiculos = veiculosRepository.findAll();
		return veiculos;
	
		
	}

}
