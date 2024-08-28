package com.young_dev.first_exercise.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.young_dev.first_exercise.dto.TarefaDto;
import com.young_dev.first_exercise.entity.TarefaEntity;
import com.young_dev.first_exercise.repository.TarefaRepository;
import com.young_dev.first_exercise.service.TarefaService;

@Service
public class TarefaServiceImpl implements TarefaService {

	@Autowired
	private TarefaRepository repository;

	@Override
	public List<TarefaDto> getAllTarefas() {
		List<TarefaDto> tarefas = new ArrayList<TarefaDto>();
		List<TarefaEntity> tarefasEntities = repository.findAll();

		for (int i = 0; i < tarefasEntities.size(); i++) {
			tarefas.add(new TarefaDto(tarefasEntities.get(i)));
		}
		return tarefas;
	}


	@Override
	public TarefaDto getTarefaById(Long id) {
		@SuppressWarnings("deprecation")
		TarefaEntity tarefaEntity = repository.getById(id);
		return new TarefaDto(tarefaEntity);
	}

	@Override
	public TarefaDto postTarefa(TarefaDto newTarefa) {
		TarefaEntity tarefaEntity = new TarefaEntity(newTarefa);
		TarefaEntity entidadePersistida = repository.save(tarefaEntity);
		return new TarefaDto(entidadePersistida);
	}

	public TarefaDto putTarefa(Long id, TarefaDto tarefaAtualizada) {

		TarefaEntity tarefaEntidade = repository.findById(id).orElse(null);

		if (tarefaEntidade != null) {
			tarefaEntidade.updateTarefa(tarefaAtualizada);
			repository.save(tarefaEntidade);
			return tarefaAtualizada;
		}
		
		return null;
	}

	public void deleteTarefa(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
