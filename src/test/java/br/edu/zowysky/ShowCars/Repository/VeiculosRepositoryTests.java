package br.edu.zowysky.ShowCars.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.zowysky.ShowCars.domain.Categoria;
import br.edu.zowysky.ShowCars.domain.Veiculos;
import br.edu.zowysky.ShowCars.repository.CategoriaRepository;
import br.edu.zowysky.ShowCars.repository.VeiculosRepository;

@SpringBootTest
public class VeiculosRepositoryTests {
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private VeiculosRepository veiculoRepository;

	@Test
	public void criar() {
		Categoria categoria1 = new Categoria();
		categoria1.setDescrição("Sedan de 4 portas de médio porte");
		categoria1.setTipo("Sedan");
		
		Categoria categoria2 = new Categoria();
		categoria2.setDescrição("SUV Compactual");
		categoria2.setTipo("SUV");
		
		Veiculos veiculo1 = new Veiculos(null, "Civic", Short.valueOf("2021"), 1001, "Branco", 150.500,
				"Touring", categoria1);
		Veiculos veiculo2 = new Veiculos(null, "Captur", Short.valueOf("2019"), 28001, "Vermelho", 70.000,
				"Life", categoria2);
			
		
		categoriaRepository.save(categoria1);
		categoriaRepository.save(categoria2);
		veiculoRepository.save(veiculo1);
		veiculoRepository.save(veiculo2);
	
	}
	
}
