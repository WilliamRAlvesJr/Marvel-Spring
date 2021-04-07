package com.william.marvelspring.service;

import com.william.marvelspring.domain.dto.StorieDTO;
import com.william.marvelspring.domain.model.Character;
import com.william.marvelspring.domain.repository.CharacterRepository;
import com.william.marvelspring.domain.repository.StorieRepository;
import com.william.marvelspring.domain.transformer.StorieTransformer;
import com.william.marvelspring.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StorieService {

    private final CharacterRepository characterRepository;
    private final StorieRepository storieRepository;
    private final StorieTransformer storieTransformer;

    public StorieService(CharacterRepository characterRepository, StorieRepository storieRepository, StorieTransformer storieTransformer) {
        this.characterRepository = characterRepository;
        this.storieRepository = storieRepository;
        this.storieTransformer = storieTransformer;
    }

    public List<StorieDTO> findByCharacterId(Long id) {
        Optional<Character> entity = characterRepository.findById(id);
        if (!entity.isPresent()) {
            throw new ResourceNotFoundException();
        }
        return storieRepository.findByCharacter(entity.get()).stream().map(storieTransformer::toDTO).collect(Collectors.toList());
    }
}
