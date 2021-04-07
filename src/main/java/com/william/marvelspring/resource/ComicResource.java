package com.william.marvelspring.resource;

import com.william.marvelspring.domain.dto.ComicDTO;
import com.william.marvelspring.service.ComicService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/public/characters/{id}/comics", produces = MediaType.APPLICATION_JSON_VALUE)
public class ComicResource {

    private ComicService comicService;

    public ComicResource(ComicService comicService) {
        this.comicService = comicService;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
    })
    @GetMapping()
    public ResponseEntity<List<ComicDTO>> findByCharacterId(@PathVariable("id") Long characterId) {
        return ResponseEntity.ok().body(comicService.findByCharacterId(characterId));
    }
}
