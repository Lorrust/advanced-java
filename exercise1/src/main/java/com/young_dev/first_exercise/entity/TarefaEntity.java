package com.young_dev.first_exercise.entity;

import com.young_dev.first_exercise.dto.TarefaDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "tarefa-matutino")
public class TarefaEntity {
	
//	TODO Create updateTarefa

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String titulo;
	private String descricao;
	private Boolean status;
	
	public TarefaEntity(TarefaDto dto) {
		this.id = dto.getId();
		this.titulo = dto.getTitulo();
		this.descricao = dto.getDescricao();
		this.status = dto.getStatus();
		
	}
	

}
