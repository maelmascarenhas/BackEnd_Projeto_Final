package com.example.model;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PaginaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String comentario;
	private String historia;
	
	@OneToOne(mappedBy = "paginaModel")
	private CarrosModel carrosModel;
	
	@ManyToMany
	@JoinTable(
	  name = "pagina_per_user", 
	  joinColumns = @JoinColumn(name = "pagina_id"), 
	  inverseJoinColumns = @JoinColumn(name = "usuario_id"))
	private List<PaginaModel> paginasUsuarios;
	
	
}
