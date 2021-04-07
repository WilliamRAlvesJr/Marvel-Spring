package com.william.marvelspring.domain.repository;

import com.william.marvelspring.domain.model.Character;
import com.william.marvelspring.domain.model.Storie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StorieRepository extends JpaRepository<Storie, Long> {

    List<Storie> findByCharacter(Character character);
}
