package com.example.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class CarrosModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Long Id;
	private String modelo;
	private String marca;
	private String tipoDeCarro;
	private Boolean abs;
	private Boolean tracao4x4;
	private Boolean comandoNoVolante;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private UsuarioModel usuario;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "paginaModel", referencedColumnName = "id")
	private PaginaModel paginaModel;
}
