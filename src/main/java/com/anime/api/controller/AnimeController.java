package com.anime.api.controller;

import com.anime.api.domain.Anime;
import com.anime.api.mapper.anime.AnimePostRequest;
import com.anime.api.service.AnimesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;

@Log4j2
@RestController
@RequestMapping("/animes")
@RequiredArgsConstructor
public class AnimeController {
    private final AnimesService animesService;

    @GetMapping
    public List<Anime> getAllAnimes() {
        return animesService.getAllAnimes();
    }

    @GetMapping(path = "/{id}")
    public Anime getById(@PathVariable Integer id) {
        Anime res = animesService.getById(id);
        return res;
    }

    @PostMapping
    public Anime save(@RequestBody @Valid AnimePostRequest animePostRequest) {
        return animesService.save(animePostRequest);
    }

    @GetMapping("/download")
    public ResponseEntity<FileSystemResource> downloadFile() {
        File file = new File("path/to/file.txt");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment", "file.txt");
        return new ResponseEntity<>(new FileSystemResource(file), headers, HttpStatus.OK);
    }
}
