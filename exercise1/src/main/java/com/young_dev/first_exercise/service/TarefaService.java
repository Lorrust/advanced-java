package com.young_dev.first_exercise.service;

import java.util.List;

import com.young_dev.first_exercise.dto.TarefaDto;

public interface TarefaService {
	
	List<TarefaDto> getAllTarefas();
	
	TarefaDto getTarefaById(Long id);
//	
	TarefaDto postTarefa(TarefaDto newTarefa);
//	
	TarefaDto putTarefa(Long id, TarefaDto tarefaAtualizada);
//	
	void deleteTarefa(Long id);
	
	}