package br.edu.zowysky.ShowCars.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.zowysky.ShowCars.domain.Seguros;
import br.edu.zowysky.ShowCars.repository.SegurosRepository;

@SpringBootTest
public class SegurosRepositoryTests {
	@Autowired
	private SegurosRepository seguroRepository;

	@Test
	public void inserir() {
		Seguros seguro1 = new Seguros(null, "Bradesco Seguros", "11-2711-7000", "Cobertura completa ", 4999.99);
		Seguros seguro2 = new Seguros(null, "Liberty Seguros", "11-2725-3696", "Cobertura completa + Guincho", 4199.99);
		Seguros seguro3 = new Seguros(null, "Porto Seguro", "11-2165-3030", "Cobertura contra furto e roubo", 5255.60);
		Seguros seguro4 = new Seguros(null, "Tokio Marine", "11-2255-7070", "Cobertura contra furto e roubou + batidas", 4456.99);
		
		seguroRepository.save(seguro1);
		seguroRepository.save(seguro2);
		seguroRepository.save(seguro3);
		seguroRepository.save(seguro4);
		
		
	}

}
