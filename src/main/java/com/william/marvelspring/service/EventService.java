package com.william.marvelspring.service;

import com.william.marvelspring.domain.dto.EventDTO;
import com.william.marvelspring.domain.model.Character;
import com.william.marvelspring.domain.repository.CharacterRepository;
import com.william.marvelspring.domain.repository.EventRepository;
import com.william.marvelspring.domain.transformer.EventTransformer;
import com.william.marvelspring.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EventService {

    private final CharacterRepository characterRepository;
    private final EventRepository eventRepository;
    private final EventTransformer eventTransformer;

    public EventService(CharacterRepository characterRepository, EventRepository eventRepository, EventTransformer eventTransformer) {
        this.characterRepository = characterRepository;
        this.eventRepository = eventRepository;
        this.eventTransformer = eventTransformer;
    }

    public List<EventDTO> findByCharacterId(Long id) {
        Optional<Character> entity = characterRepository.findById(id);
        if (!entity.isPresent()) {
            throw new ResourceNotFoundException();
        }
        return eventRepository.findByCharacter(entity.get()).stream().map(eventTransformer::toDTO).collect(Collectors.toList());
    }
}
