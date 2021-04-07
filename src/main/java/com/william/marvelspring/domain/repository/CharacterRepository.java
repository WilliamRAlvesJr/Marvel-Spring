package com.william.marvelspring.domain.repository;

import com.william.marvelspring.domain.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {

}
