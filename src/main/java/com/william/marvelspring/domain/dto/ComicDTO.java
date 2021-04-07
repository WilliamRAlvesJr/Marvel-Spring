package com.william.marvelspring.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ComicDTO {

    private Long id;
    private String name;
    private Long issueNumber;
    private LocalDateTime modified;
}
