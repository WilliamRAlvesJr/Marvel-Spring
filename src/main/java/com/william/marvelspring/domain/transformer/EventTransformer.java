package com.william.marvelspring.domain.transformer;

import com.william.marvelspring.domain.dto.EventDTO;
import com.william.marvelspring.domain.model.Event;
import org.springframework.stereotype.Service;

@Service
public class EventTransformer {

    public Event toEntity(EventDTO eventDto) {
        return Event.builder()
                .id(eventDto.getId())
                .name(eventDto.getName())
                .description(eventDto.getDescription())
                .build();
    }

    public EventDTO toDTO(Event event) {
        return EventDTO.builder()
                .id(event.getId())
                .name(event.getName())
                .description(event.getDescription())
                .build();
    }
}
