package com.dba.carrental.entities.transformations.PlaylistMapper;

import com.dba.carrental.entities.Playlist;
import com.dba.carrental.entities.dtoEntitie.PlaylistDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class PlayListMapper implements Function<PlaylistDto, Playlist> {
    @Override
    public Playlist apply(PlaylistDto playlistDto) {
        return new Playlist(
                playlistDto.getName(),
                playlistDto.getPlayListId()
        );
    }
}
