package br.edu.zowysky.ShowCars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.zowysky.ShowCars.domain.Clientes;
import br.edu.zowysky.ShowCars.repository.ClientesRepository;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
	@Autowired
	private ClientesRepository clientesRepository;
	@GetMapping
	public List<Clientes> listar(){
		List<Clientes> clientes = clientesRepository.findAll();
		return clientes;
		
	}

}
