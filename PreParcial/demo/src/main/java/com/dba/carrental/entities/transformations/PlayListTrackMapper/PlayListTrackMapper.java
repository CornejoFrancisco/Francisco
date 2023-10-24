package com.dba.carrental.entities.transformations.PlayListTrackMapper;

import com.dba.carrental.entities.Playlist_track;
import com.dba.carrental.entities.dtoEntitie.PlaylistTrackDto;

import java.util.function.Function;

public class PlayListTrackMapper implements Function<PlaylistTrackDto, Playlist_track> {

    @Override
    public Playlist_track apply(PlaylistTrackDto playlistTrackDto){
        return new Playlist_track(
                playlistTrackDto.getPlayListId(),
                playlistTrackDto.getTrackId()
        );
    }
}
