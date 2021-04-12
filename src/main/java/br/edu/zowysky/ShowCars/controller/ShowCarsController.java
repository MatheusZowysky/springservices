package br.edu.zowysky.ShowCars.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inicio")
public class ShowCarsController {
	@RequestMapping("/ola")
	public String exibirMensagem() {
		return "Ola Inimigos";
	}

}
