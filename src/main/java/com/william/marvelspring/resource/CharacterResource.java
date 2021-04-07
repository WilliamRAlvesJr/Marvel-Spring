package com.william.marvelspring.resource;

import com.william.marvelspring.domain.dto.CharacterDTO;
import com.william.marvelspring.service.CharacterService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/public/characters", produces = MediaType.APPLICATION_JSON_VALUE)
public class CharacterResource {

    private CharacterService characterService;

    public CharacterResource(CharacterService characterService) {
        this.characterService = characterService;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
    })
    @GetMapping
    public ResponseEntity<List<CharacterDTO>> selectAll() {
        return ResponseEntity.ok().body(characterService.selectAll());
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not found")
    })
    @GetMapping(value = "/{id}")
    public ResponseEntity<CharacterDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(characterService.find(id));
    }
}
