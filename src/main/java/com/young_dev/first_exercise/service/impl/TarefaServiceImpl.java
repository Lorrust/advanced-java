package com.young_dev.first_exercise.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.young_dev.first_exercise.dto.TarefaDto;
import com.young_dev.first_exercise.service.TarefaService;

@Service
public class TarefaServiceImpl implements TarefaService {

	List<TarefaDto> tarefas = new ArrayList<>();
	int counter = 0;

	@Override
	public List<TarefaDto> getAllTarefas() {
		return tarefas;
	}

	@Override
	public TarefaDto getTarefaById(int id) {
		return tarefas.stream().filter(tarefa -> tarefa.getId().equals(id)).findFirst().orElse(null);
	}

	public void postTarefa(TarefaDto newTarefa) {
		counter++;
		newTarefa.setId(counter);
		tarefas.add(newTarefa);
	}

	public TarefaDto putTarefa(Integer id, TarefaDto tarefaAtualizada) {

		Optional<TarefaDto> busca = tarefas.stream().filter(tarefa -> id == tarefa.getId()).findFirst();
		if (busca.isPresent()) {
			busca.get().setTitulo(tarefaAtualizada.getTitulo());
			busca.get().setDescricao(tarefaAtualizada.getDescricao());
			busca.get().setStatus(tarefaAtualizada.isStatus());
		}
		return null;
	}

	public void deleteTarefa(@PathVariable int id) {
		tarefas.removeIf(tarefa -> tarefa.getId().equals(id));
	}
	
}
