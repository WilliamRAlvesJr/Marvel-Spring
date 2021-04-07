package com.william.marvelspring.domain.repository;

import com.william.marvelspring.domain.model.Character;
import com.william.marvelspring.domain.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByCharacter(Character character);
}
