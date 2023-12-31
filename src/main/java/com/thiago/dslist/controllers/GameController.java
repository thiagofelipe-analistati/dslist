package com.thiago.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiago.dslist.entities.dto.GameDTO;
import com.thiago.dslist.entities.dto.GameMinDTO;
import com.thiago.dslist.services.GameService;



@RestController
@RequestMapping(value="/games")
public class GameController {
	@Autowired
	private GameService gameService;
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.finAll();
		return result;
	}
	@GetMapping(value = "/{id}")
	public GameDTO findbyId(@PathVariable Long id){
		GameDTO result = gameService.findByID(id);
		return result;
	}
}
