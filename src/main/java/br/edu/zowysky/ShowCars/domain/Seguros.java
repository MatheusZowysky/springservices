package br.edu.zowysky.ShowCars.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Seguros {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short codigo;
	
	@Column(length = 70, nullable = false, unique = true)
	private String nome;
	
	@Column(length = 20, nullable = false)
	private String numContato;
	
	@Column(nullable = false)
	private String tipoCobertura;
	
	@Column(nullable = false)
	private Double valor;
	
	
	
	
	
	

}
