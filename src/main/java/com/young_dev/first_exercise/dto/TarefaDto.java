package com.young_dev.first_exercise.dto;

import com.young_dev.first_exercise.entity.TarefaEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TarefaDto {

	Long id;
	String titulo;
	String descricao;
	Boolean status;
	
	public TarefaDto(TarefaEntity entity) {
		this.id = entity.getId();
		this.titulo = entity.getTitulo();
		this.descricao = entity.getDescricao();
		this.status = entity.getStatus();
	}

}