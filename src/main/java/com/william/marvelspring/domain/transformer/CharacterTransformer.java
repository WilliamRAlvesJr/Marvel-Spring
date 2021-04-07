package com.william.marvelspring.domain.transformer;

import com.william.marvelspring.domain.model.Character;
import com.william.marvelspring.domain.dto.CharacterDTO;
import org.springframework.stereotype.Service;

@Service
public class CharacterTransformer {

    public Character toEntity(CharacterDTO characterDto) {
        return Character.builder()
                .id(characterDto.getId())
                .name(characterDto.getName())
                .description(characterDto.getDescription())
                .build();
    }

    public CharacterDTO toDTO(Character character) {
        return CharacterDTO.builder()
                .id(character.getId())
                .name(character.getName())
                .description(character.getDescription())
                .build();
    }
}
