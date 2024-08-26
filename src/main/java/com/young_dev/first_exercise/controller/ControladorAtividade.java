package com.young_dev.first_exercise.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/tasks")
public class ControladorAtividade {

	static List<Atividade> Atividades = new ArrayList<Atividade>();
	
//	Atividades.add(new Activity(1, "Homework", "finish math exercises", false));
	
	@GetMapping
	public Atividade getActivity() {
		return new Atividade(1, "Homework", "finish math exercises", false);
	}
	
	
	@GetMapping
	public List<Atividade> getAll() {
		return Atividades;
	}

	@PostMapping
	public void newActivity(@RequestBody Atividade Activity) {
		Atividades.add(Activity);
	}

}
	
	
	


