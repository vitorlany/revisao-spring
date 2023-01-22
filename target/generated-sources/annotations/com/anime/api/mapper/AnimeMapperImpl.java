package com.anime.api.mapper;

import com.anime.api.domain.Anime;
import com.anime.api.mapper.anime.AnimePostRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-22T14:14:15-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class AnimeMapperImpl implements AnimeMapper {

    @Override
    public Anime dtoToAnime(AnimePostRequest animePostMapper) {
        if ( animePostMapper == null ) {
            return null;
        }

        Anime.AnimeBuilder anime = Anime.builder();

        anime.name( animePostMapper.getName() );

        return anime.build();
    }

    @Override
    public AnimePostRequest animeToDto(Anime animePostMapper) {
        if ( animePostMapper == null ) {
            return null;
        }

        AnimePostRequest.AnimePostRequestBuilder animePostRequest = AnimePostRequest.builder();

        animePostRequest.name( animePostMapper.getName() );

        return animePostRequest.build();
    }
}
