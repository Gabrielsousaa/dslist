package com.ds.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
