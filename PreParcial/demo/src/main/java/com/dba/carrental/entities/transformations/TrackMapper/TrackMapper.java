package com.dba.carrental.entities.transformations.TrackMapper;

import com.dba.carrental.entities.Track;
import com.dba.carrental.entities.dtoEntitie.TrackDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class TrackMapper implements Function<TrackDto, Track> {
    @Override
    public Track apply(TrackDto trackDto){
        return new Track(
                trackDto.getTrackId(),
                trackDto.getName(),
                trackDto.getAlbum(),
                trackDto.getMediaTypel(),
                trackDto.getGenre(),
                trackDto.getComposer(),
                trackDto.getMiliSeconds(),
                trackDto.getBytes(),
                trackDto.getUnitPrice()
        );
    }
}
