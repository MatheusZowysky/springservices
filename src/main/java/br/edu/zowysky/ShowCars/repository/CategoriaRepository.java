package br.edu.zowysky.ShowCars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.zowysky.ShowCars.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Short>{

}
