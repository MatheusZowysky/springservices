package br.edu.zowysky.ShowCars.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SegurosTests {
	@Test
	public void criar() {
		Seguros seguro = new Seguros(Short.valueOf("10"), "Liberty Seguros","(11) 2578-2010", "Cobertura Completa", 4000.00);
	}

}
