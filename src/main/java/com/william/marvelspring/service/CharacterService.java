package com.william.marvelspring.service;

import com.william.marvelspring.domain.model.Character;
import com.william.marvelspring.domain.dto.CharacterDTO;
import com.william.marvelspring.domain.repository.CharacterRepository;
import com.william.marvelspring.domain.transformer.CharacterTransformer;
import com.william.marvelspring.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;
    private final CharacterTransformer characterTransformer;

    public CharacterService(CharacterRepository characterRepository, CharacterTransformer characterTransformer) {
        this.characterRepository = characterRepository;
        this.characterTransformer = characterTransformer;
    }

    public List<CharacterDTO> selectAll() {
        return characterRepository.findAll().stream().map(characterTransformer::toDTO).collect(Collectors.toList());
    }

    public CharacterDTO find(Long id) {
        Optional<Character> entity = characterRepository.findById(id);
        if (!entity.isPresent()) {
            throw new ResourceNotFoundException();
        }
        return characterTransformer.toDTO(entity.get());
    }
}
