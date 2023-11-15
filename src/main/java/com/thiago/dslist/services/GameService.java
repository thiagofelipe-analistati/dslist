package com.thiago.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thiago.dslist.entities.Game;
import com.thiago.dslist.entities.dto.GameDTO;
import com.thiago.dslist.entities.dto.GameMinDTO;
import com.thiago.dslist.projections.GameMinProjection;
import com.thiago.dslist.repositoreis.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gamerepository;
	@Transactional(readOnly = true)
	public GameDTO findByID(Long id) {
		Game result = gamerepository.findById(id).get();
		return new GameDTO(result);
		}
	@Transactional(readOnly = true)
	public List<GameMinDTO> finAll(){
		List<Game> result = gamerepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long list){
		List<GameMinProjection> result = gamerepository.searchByList(list);
		return  result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}
}