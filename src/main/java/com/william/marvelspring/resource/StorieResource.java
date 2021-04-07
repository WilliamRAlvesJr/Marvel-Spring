package com.william.marvelspring.resource;

import com.william.marvelspring.domain.dto.StorieDTO;
import com.william.marvelspring.service.StorieService;
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
@RequestMapping(value = "/v1/public/characters/{id}/stories", produces = MediaType.APPLICATION_JSON_VALUE)
public class StorieResource {

    private StorieService storieService;

    public StorieResource(StorieService storieService) {
        this.storieService = storieService;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
    })
    @GetMapping()
    public ResponseEntity<List<StorieDTO>> findByCharacterId(@PathVariable("id") Long characterId) {
        return ResponseEntity.ok().body(storieService.findByCharacterId(characterId));
    }
}
