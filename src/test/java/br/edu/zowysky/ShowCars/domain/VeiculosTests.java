package br.edu.zowysky.ShowCars.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class VeiculosTests {
	@Test
	public void criar() {
		Categoria categoria = new Categoria(); 
		categoria.setDescrição("Sedan de 4 portas de médio porte");
		categoria.setId(Short.valueOf("121"));
		categoria.setTipo("Sedan");
		Veiculos v = new Veiculos(Short.valueOf("131"),
				"Civic",
				Short.valueOf("2021"),
				1000,
				"Branco",
				150.500,
				"Touring",
				categoria)
				;
		
	}

}
