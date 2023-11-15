package com.thiago.dslist.repositoreis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.dslist.entities.GameList;
@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
