package com.CursoDevSuperior.Curso.repositories;

import com.CursoDevSuperior.Curso.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
