package com.young_dev.first_exercise.service;

import java.util.List;

import com.young_dev.first_exercise.dto.TarefaDto;

public interface TarefaService {
	
	List<TarefaDto> getAllTarefas();
	
	TarefaDto getTarefaById(int id);
	
	void postTarefa(TarefaDto newTarefa);
	
	TarefaDto putTarefa(Integer id, TarefaDto tarefaAtualizada);
	
	void deleteTarefa(int id);
	
	}