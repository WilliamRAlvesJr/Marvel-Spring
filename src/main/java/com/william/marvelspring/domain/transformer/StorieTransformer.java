package com.william.marvelspring.domain.transformer;

import com.william.marvelspring.domain.dto.StorieDTO;
import com.william.marvelspring.domain.model.Storie;
import org.springframework.stereotype.Service;

@Service
public class StorieTransformer {

    public Storie toEntity(StorieDTO storieDto) {
        return Storie.builder()
                .id(storieDto.getId())
                .name(storieDto.getName())
                .description(storieDto.getDescription())
                .build();
    }

    public StorieDTO toDTO(Storie storie) {
        return StorieDTO.builder()
                .id(storie.getId())
                .name(storie.getName())
                .description(storie.getDescription())
                .build();
    }
}
