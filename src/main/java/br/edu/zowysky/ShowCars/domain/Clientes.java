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
public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idCliente;
	
	@Column(length = 80, nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String numero;
	
	@Column(nullable = false)
	private Byte idade; 
	
	@Column(nullable = false )
	private Character sexo;
	
	@Column(length = 20, nullable = false, unique = true)
	private String cpf;

}
