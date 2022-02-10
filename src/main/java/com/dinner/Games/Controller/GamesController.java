package com.dinner.Games.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dinner.Games.Model.Game;
import com.dinner.Games.Service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GamesController {
	
	@Autowired
	private GameService gameServ;
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<Game>> getAllGames(){
		List<Game> allGames = gameServ.getGames();
		return new ResponseEntity<>(allGames, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional <Game>> getGameById(@PathVariable Integer id){
		Optional<Game> getGame = gameServ.findGameById(id);
		return new ResponseEntity<Optional<Game>>(getGame, HttpStatus.OK);
	}
	
	@PostMapping(value="/add")
		public ResponseEntity<Game> addGame(@RequestBody Game game){
			Game newGame = gameServ.addGame(game);
			return new ResponseEntity<>(newGame, HttpStatus.CREATED);
		}
	
	@PutMapping(value = "/update")
	public ResponseEntity<Game> updateGame(@RequestBody Game game){
			Game updatedGame = gameServ.updateGame(game);
			return new ResponseEntity<>(updatedGame, HttpStatus.FOUND);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<String> deleteGame(@PathVariable Integer id){
		String message = "Deleted";
		gameServ.deleteGameById(id);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
}
