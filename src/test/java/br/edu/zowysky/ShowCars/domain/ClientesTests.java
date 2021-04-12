package br.edu.zowysky.ShowCars.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClientesTests {
	@Test
	public void criar() {
		Clientes cliente = new Clientes(
				Short.valueOf("131"),
				"Mauricio de Souza",
				"1199456-3212",
				Byte.valueOf("45"),
				'M',
				"475.325.123-90");
	}

}
