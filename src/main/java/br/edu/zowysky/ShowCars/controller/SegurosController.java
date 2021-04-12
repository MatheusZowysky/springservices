package br.edu.zowysky.ShowCars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.zowysky.ShowCars.domain.Seguros;
import br.edu.zowysky.ShowCars.repository.SegurosRepository;

@RestController
@RequestMapping("/Seguros")
public class SegurosController {
	@Autowired
	private SegurosRepository segurosRepository;
	
	@GetMapping
	public List<Seguros> listar(){
		List<Seguros> seguro = segurosRepository.findAll();
		return seguro;
		 
		
	}
	
	@PostMapping
	public Seguros inserir(@RequestBody Seguros seguros) {
		Seguros segurosSalvo = segurosRepository.save(seguros);
		return segurosSalvo;
		
	}

}
