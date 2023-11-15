package com.thiago.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.dslist.entities.Game;
import com.thiago.dslist.entities.dto.GameMinDTO;
import com.thiago.dslist.repositoreis.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gamerepository;
	public List<GameMinDTO> finAll(){
		List<Game> result = gamerepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
