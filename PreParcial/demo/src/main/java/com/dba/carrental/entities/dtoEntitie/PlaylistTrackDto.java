package com.dba.carrental.entities.dtoEntitie;

import com.dba.carrental.entities.Playlist;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class PlaylistTrackDto {
    private long PlayListId;
    private long TrackId;


}
