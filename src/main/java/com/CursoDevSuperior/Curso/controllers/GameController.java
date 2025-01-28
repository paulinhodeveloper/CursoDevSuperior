package com.CursoDevSuperior.Curso.controllers;

import com.CursoDevSuperior.Curso.dto.GameMinDTO;
import com.CursoDevSuperior.Curso.entities.Game;
import com.CursoDevSuperior.Curso.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

}
