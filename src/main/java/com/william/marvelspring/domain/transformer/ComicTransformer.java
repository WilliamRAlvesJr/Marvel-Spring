package com.william.marvelspring.domain.transformer;

import com.william.marvelspring.domain.dto.ComicDTO;
import com.william.marvelspring.domain.model.Comic;
import org.springframework.stereotype.Service;

@Service
public class ComicTransformer {

    public Comic toEntity(ComicDTO comicDto) {
        return Comic.builder()
                .id(comicDto.getId())
                .name(comicDto.getName())
                .issueNumber(comicDto.getIssueNumber())
                .modified(comicDto.getModified())
                .build();
    }

    public ComicDTO toDTO(Comic comic) {
        return ComicDTO.builder()
                .id(comic.getId())
                .name(comic.getName())
                .issueNumber(comic.getIssueNumber())
                .modified(comic.getModified())
                .build();
    }
}
