package br.edu.zowysky.ShowCars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.zowysky.ShowCars.domain.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Short>{

}
