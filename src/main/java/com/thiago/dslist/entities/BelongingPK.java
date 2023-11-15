package com.thiago.dslist.entities;

import java.util.Objects;


import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
	@ManyToOne
	@JoinColumn(name= "game_id")
	private Game game;
	@ManyToOne
	@JoinColumn(name= "list_id")
	private GameList list;
	public BelongingPK() {
		
	}
	public BelongingPK(GameList list, Game game) {
		this.list = list;
		this.game = game;
	}
	public GameList getGameList() {
		return list;
	}
	public void setGameList(GameList list) {
		this.list = list;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	@Override
	public int hashCode() {
		return Objects.hash(game);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game);
	}
	
}
