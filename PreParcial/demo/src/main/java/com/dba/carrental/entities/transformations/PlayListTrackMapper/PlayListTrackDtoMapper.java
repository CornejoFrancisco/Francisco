package com.dba.carrental.entities.transformations.PlayListTrackMapper;

import com.dba.carrental.entities.Playlist_track;
import com.dba.carrental.entities.dtoEntitie.PlaylistTrackDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class PlayListTrackDtoMapper implements Function<Playlist_track, PlaylistTrackDto> {
    @Override
    public PlaylistTrackDto apply(Playlist_track playlistTrack) {
        return new PlaylistTrackDto(
                playlistTrack.getTrackId(),
                playlistTrack.getPlaylistId().getPlayListId()
        );
    }
}
