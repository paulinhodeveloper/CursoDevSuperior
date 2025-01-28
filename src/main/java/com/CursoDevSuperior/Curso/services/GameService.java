package com.CursoDevSuperior.Curso.services;

import com.CursoDevSuperior.Curso.dto.GameMinDTO;
import com.CursoDevSuperior.Curso.entities.Game;
import com.CursoDevSuperior.Curso.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
