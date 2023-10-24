package com.dba.carrental.entities.transformations.TrackMapper;

import com.dba.carrental.entities.Track;
import com.dba.carrental.entities.dtoEntitie.TrackDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class TrackDtoMapper implements Function<Track, TrackDto> {
    @Override
    public TrackDto apply(Track track) {
        return new TrackDto(
           track.getTrackId(),
           track.getName(),
           track.getAlbum(),
           track.getMediaTypel(),
                track.getGenre(),
           track.getComposer(),
           track.getMiliSeconds(),
                track.getBytes(),
                track.getUnitPrice()
        );
    }
}
