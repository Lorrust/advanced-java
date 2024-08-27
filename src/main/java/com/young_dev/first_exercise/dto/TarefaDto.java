package com.young_dev.first_exercise.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TarefaDto {

	Integer id;
	String titulo;
	String descricao;
	boolean status;

}