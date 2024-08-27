package com.young_dev.first_exercise.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tarefa {
	
	int id;
	String titulo;
	String descricao;
	boolean status;

}
