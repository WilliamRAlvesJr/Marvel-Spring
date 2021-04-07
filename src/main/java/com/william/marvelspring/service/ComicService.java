package com.william.marvelspring.service;

import com.william.marvelspring.domain.dto.ComicDTO;
import com.william.marvelspring.domain.model.Character;
import com.william.marvelspring.domain.repository.CharacterRepository;
import com.william.marvelspring.domain.repository.ComicRepository;
import com.william.marvelspring.domain.transformer.ComicTransformer;
import com.william.marvelspring.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ComicService {

    private final CharacterRepository characterRepository;
    private final ComicRepository comicRepository;
    private final ComicTransformer comicTransformer;

    public ComicService(CharacterRepository characterRepository, ComicRepository comicRepository, ComicTransformer comicTransformer) {
        this.characterRepository = characterRepository;
        this.comicRepository = comicRepository;
        this.comicTransformer = comicTransformer;
    }

    public List<ComicDTO> findByCharacterId(Long id) {
        Optional<Character> entity = characterRepository.findById(id);
        if (!entity.isPresent()) {
            throw new ResourceNotFoundException();
        }
        return comicRepository.findByCharacter(entity.get()).stream().map(comicTransformer::toDTO).collect(Collectors.toList());
    }
}
