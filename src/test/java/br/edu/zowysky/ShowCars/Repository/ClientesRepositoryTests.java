package br.edu.zowysky.ShowCars.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.zowysky.ShowCars.domain.Clientes;
import br.edu.zowysky.ShowCars.repository.ClientesRepository;

@SpringBootTest
public class ClientesRepositoryTests {
	@Autowired
	private ClientesRepository clientesRepository;

	@Test
	public void inserir() {
		Clientes cliente1 = new Clientes(null, "Mauricio de Souza", "1199456-3212", Byte.valueOf("45"), 'M',
				"475.325.123-90");

		Clientes cliente2 = new Clientes(null, "Joel Moras", "1199576-2222", Byte.valueOf("40"), 'M', "475.000.555-90");

		clientesRepository.save(cliente1);
		clientesRepository.save(cliente2);
	}

}
