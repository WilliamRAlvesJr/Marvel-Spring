package com.william.marvelspring.service;

import com.william.marvelspring.domain.dto.SerieDTO;
import com.william.marvelspring.domain.model.Character;
import com.william.marvelspring.domain.repository.CharacterRepository;
import com.william.marvelspring.domain.repository.SerieRepository;
import com.william.marvelspring.domain.transformer.SerieTransformer;
import com.william.marvelspring.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SerieService {

    private final CharacterRepository characterRepository;
    private final SerieRepository serieRepository;
    private final SerieTransformer serieTransformer;

    public SerieService(CharacterRepository characterRepository, SerieRepository serieRepository, SerieTransformer serieTransformer) {
        this.characterRepository = characterRepository;
        this.serieRepository = serieRepository;
        this.serieTransformer = serieTransformer;
    }

    public List<SerieDTO> findByCharacterId(Long id) {
        Optional<Character> entity = characterRepository.findById(id);
        if (!entity.isPresent()) {
            throw new ResourceNotFoundException();
        }
        return serieRepository.findByCharacter(entity.get()).stream().map(serieTransformer::toDTO).collect(Collectors.toList());
    }
}
