package com.young_dev.first_exercise.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
	
	List<Tarefa> tarefas = new ArrayList<>();
	
	@GetMapping
	public List<Tarefa> getAllTarefas() {
		return tarefas;
	}
	
	@GetMapping("/{id}")
    public Tarefa getTarefaById(@PathVariable int id) {
        return tarefas.stream().filter(tarefa -> tarefa.id == id).findFirst().orElse(null);
    }
	
	@PostMapping
	public void postTarefa(@RequestBody Tarefa tarefa) {
		tarefas.add(tarefa);
	}
	
	@PutMapping("/{id}")
	public Tarefa putTarefa(@PathVariable int id, @RequestBody Tarefa tarefaAtualizada) {
		tarefas.get(id).equals(tarefaAtualizada);
		tarefas.add(tarefaAtualizada);
		return tarefaAtualizada;
	}
	
	@DeleteMapping("/{id}")
	public void deleteTarefa(@PathVariable int id) {
		tarefas.remove(id);
	}

}
