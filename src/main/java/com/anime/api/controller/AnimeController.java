package com.anime.api.controller;

import com.anime.api.domain.Anime;
import com.anime.api.mapper.anime.AnimePostRequest;
import com.anime.api.service.AnimesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Log4j2
@RestController
//@RequiredArgsConstructor
@RequestMapping("/animes")
public class AnimeController {
    @Autowired
    private AnimesService animesService;

    @GetMapping
    public List<Anime> getAllAnimes() {
        return animesService.getAllAnimes();
    }

    @GetMapping(path = "/{id}")
    public Anime getById(@PathVariable Integer id) {
        return animesService.getById(id);
    }

    @PostMapping
    public Anime save(@RequestBody @Valid AnimePostRequest animePostRequest) {
        return animesService.save(animePostRequest);
    }
}
