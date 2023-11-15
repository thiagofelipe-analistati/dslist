package com.thiago.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thiago.dslist.entities.GameList;
import com.thiago.dslist.entities.dto.GameListDTO;
import com.thiago.dslist.repositoreis.GameListRepository;

@Service
public class GameListService {
	@Autowired
	private GameListRepository gameListrepository;
	@Transactional(readOnly = true)
	public List<GameListDTO> finAll(){
		List<GameList> result = gameListrepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
	
}
