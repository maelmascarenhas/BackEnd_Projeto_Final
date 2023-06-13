package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class CarrosDTO{
	private Long id;
	private String marca;
	private String tipoDeCarro;
	private Boolean abs;
	private Boolean tracao4x4;
	private Boolean comandoNoVolante;
	private Long usuario_id;
}
