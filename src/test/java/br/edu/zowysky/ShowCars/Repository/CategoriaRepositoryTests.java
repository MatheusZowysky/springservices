package br.edu.zowysky.ShowCars.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.zowysky.ShowCars.domain.Categoria;
import br.edu.zowysky.ShowCars.repository.CategoriaRepository;
@SpringBootTest
public class CategoriaRepositoryTests {
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Test
	public void inserir() {
		Categoria categoria1 = new Categoria(null,
				"SUV",
				"SUV Compactual");
		Categoria categoria2 = new Categoria(null,
				"Sedan",
				"Sedan de médio porte");
		Categoria categoria3 = new Categoria(null,
				"Hatch",
				"Hatckback");
		Categoria categoria4 = new Categoria(null,
				"Esportivo",
				"Até 600cv");
		Categoria categoria5 = new Categoria(null,
				"Super esportivo",
				"Até 999cv");
		Categoria categoria6 = new Categoria(null,
				"Hipercarro",
				"Mais de 1000cv");
		Categoria categoria7 = new Categoria(null,
				"Conversivel",
				"Capota reclinável");
		Categoria categoria8 = new Categoria(null,
				"Caminhonete",
				"Tração 4x4");
		Categoria categoria9 = new Categoria(null,
				"Motos",
				"Motocicletas");
		
		
		categoriaRepository.save(categoria1);
		categoriaRepository.save(categoria2);
		categoriaRepository.save(categoria3);
		categoriaRepository.save(categoria4);
		categoriaRepository.save(categoria5);
		categoriaRepository.save(categoria6);
		categoriaRepository.save(categoria7);
		categoriaRepository.save(categoria8);
		categoriaRepository.save(categoria9);
		
	
		
}
}
