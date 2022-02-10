package com.dinner.Games.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Game {
	
	@Id
	private Integer id;
	private String name;
	private Integer numberOfPlayers;
	private String type;
	
	public Game() {
	}
	
	public Game(String name, Integer numberOfPlayers, String type) {
		this.name = name;
		this.numberOfPlayers = numberOfPlayers;
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumberOfPlayers() {
		return numberOfPlayers;
	}
	public void setNumberOfPlayers(Integer numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", numberOfPlayers=" + numberOfPlayers + ", type=" + type + "]";
	}
	
	
	

}
