package com.dba.carrental.entities.dtoEntitie;

import com.dba.carrental.entities.Playlist_track;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaylistDto {
    private Integer PlayListId;
    private String Name;
}
