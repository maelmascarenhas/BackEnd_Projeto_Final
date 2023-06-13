package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UsuarioDTO{
	private Long id;
	private String nome;
	private String email;
	private int senha;
}
