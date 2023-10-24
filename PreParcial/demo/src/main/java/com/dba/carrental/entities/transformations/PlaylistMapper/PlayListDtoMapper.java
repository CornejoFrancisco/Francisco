package com.dba.carrental.entities.transformations.PlaylistMapper;

import com.dba.carrental.entities.Playlist;
import com.dba.carrental.entities.dtoEntitie.PlaylistDto;

import java.util.function.Function;

public class PlayListDtoMapper implements Function<Playlist, PlaylistDto> {
    @Override
    public PlaylistDto apply(Playlist playlist) {
        return new PlaylistDto(
                (int) playlist.getPlayListId(),
                playlist.getName()
        );
    }
}
