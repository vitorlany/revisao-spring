package com.anime.api.mapper;

import com.anime.api.domain.Anime;
import com.anime.api.mapper.anime.AnimePostRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnimeMapper {
    AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    Anime dtoToAnime(AnimePostRequest animePostMapper);
    AnimePostRequest animeToDto(Anime animePostMapper);
}
