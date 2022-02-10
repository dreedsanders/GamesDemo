package com.dinner.Games.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinner.Games.Exception.GameNotFoundException;
import com.dinner.Games.Model.Game;
import com.dinner.Games.Repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepo;
	
	public List<Game> getGames() {
		List<Game> games = gameRepo.findAll();
		return games;
		}
	
	public Optional<Game> findGameById(Integer id) throws GameNotFoundException{
		try{
			Optional<Game> foundGame = gameRepo.findById(id);
			return foundGame;
		} catch(GameNotFoundException e) {
			throw new GameNotFoundException("Game with id " + id + " not found");
		}
	}
	
	public Game addGame(Game game) {
		Game newGame = gameRepo.save(game);
		return newGame;
	}
	
	public Game updateGame(Game game) {
		Game updateGame = gameRepo.save(game);
		return updateGame;
	}
	public String deleteGameById(Integer id) {
		gameRepo.deleteById(id);
		String deleted = "Game deleted";
		return deleted;
	}
}


