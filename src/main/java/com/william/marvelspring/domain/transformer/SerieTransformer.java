package com.william.marvelspring.domain.transformer;

import com.william.marvelspring.domain.dto.SerieDTO;
import com.william.marvelspring.domain.model.Serie;
import org.springframework.stereotype.Service;

@Service
public class SerieTransformer {

    public Serie toEntity(SerieDTO serieDto) {
        return Serie.builder()
                .id(serieDto.getId())
                .name(serieDto.getName())
                .description(serieDto.getDescription())
                .build();
    }

    public SerieDTO toDTO(Serie serie) {
        return SerieDTO.builder()
                .id(serie.getId())
                .name(serie.getName())
                .description(serie.getDescription())
                .build();
    }
}
