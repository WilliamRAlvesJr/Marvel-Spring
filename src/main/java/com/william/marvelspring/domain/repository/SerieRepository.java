package com.william.marvelspring.domain.repository;

import com.william.marvelspring.domain.model.Character;
import com.william.marvelspring.domain.model.Event;
import com.william.marvelspring.domain.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SerieRepository extends JpaRepository<Serie, Long> {

    List<Serie> findByCharacter(Character character);
}
