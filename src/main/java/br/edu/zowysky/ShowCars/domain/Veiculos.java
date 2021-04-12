package br.edu.zowysky.ShowCars.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
@Entity
public class Veiculos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short codVeiculo;
	
	@Column(length = 70, nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Short AnoDeFabricação;
	
	@Column(nullable = false)
	private Integer quilometragem;
	
	@Column(nullable = false)
	private String cor;
	
	@Column(nullable = false, precision = 8 , scale = 2)
	private Double preço;
	
	@Column(nullable = false)
	private String modelo;
	
	@JoinColumn
	@ManyToOne
	private Categoria categoria;
	
	
	
	

}
