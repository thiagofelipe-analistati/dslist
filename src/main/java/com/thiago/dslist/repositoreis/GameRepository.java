package com.thiago.dslist.repositoreis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.dslist.entities.Game;
@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
	
}
