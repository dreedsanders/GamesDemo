package com.dinner.Games.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinner.Games.Model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

}
