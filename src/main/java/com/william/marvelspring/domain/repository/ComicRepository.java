package com.william.marvelspring.domain.repository;

import com.william.marvelspring.domain.model.Character;
import com.william.marvelspring.domain.model.Comic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComicRepository extends JpaRepository<Comic, Long> {

    List<Comic> findByCharacter(Character character);
}
