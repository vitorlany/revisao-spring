package com.anime.api.service;

import com.anime.api.domain.Anime;
import com.anime.api.mapper.AnimeMapper;
import com.anime.api.mapper.anime.AnimePostRequest;
import com.anime.api.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimesService {
    @Autowired
    private AnimeRepository animeRepository;

    public List<Anime> getAllAnimes() {
        return animeRepository.findAll();
    }

    public Anime getById(Integer id) {
        return animeRepository.findById(id).get();
    }

    public Anime save(AnimePostRequest animePostRequest) {
        Anime anime = AnimeMapper.INSTANCE.dtoToAnime(animePostRequest);
        animeRepository.save(anime);
        return anime;
    }
}
