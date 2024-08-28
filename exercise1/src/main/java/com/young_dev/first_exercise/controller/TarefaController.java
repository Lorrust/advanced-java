package com.young_dev.first_exercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.young_dev.first_exercise.dto.TarefaDto;
import com.young_dev.first_exercise.service.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
	
	@Autowired
	private TarefaService tarefaService;

	@GetMapping
	public List<TarefaDto> getAllTarefas() {
		return tarefaService.getAllTarefas();
	}

	@GetMapping("/{id}")
	public TarefaDto getTarefaById(@PathVariable Long id) {
		return tarefaService.getTarefaById(id);
	}

	@PostMapping
	public TarefaDto postTarefa(@RequestBody TarefaDto tarefa) {
		return tarefaService.postTarefa(tarefa);
	}

//	TODO Improve method, after using the updated entry goes to the end of the list
	@PutMapping("/{id}")
	public TarefaDto putTarefa(@PathVariable Long id, @RequestBody TarefaDto tarefaAtualizada) {
		return tarefaService.putTarefa(id, tarefaAtualizada);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTarefa(@PathVariable Long id) {
		tarefaService.deleteTarefa(id);
	}

}
