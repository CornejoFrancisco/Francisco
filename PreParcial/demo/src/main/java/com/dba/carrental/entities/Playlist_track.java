package com.dba.carrental.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Playlist_track {
    @Id
    @GeneratedValue(generator = "playlist_track")
    @TableGenerator(name = "playlist_track", table = "sqlite_sequence",
            pkColumnName = "name", valueColumnName = "seq",
            pkColumnValue="Playlist_track",
            initialValue=1, allocationSize=1)
    @OneToOne
    @JoinColumn(name = "PlayListId")
    private Playlist playlistId;

    @Id
    @GeneratedValue(generator = "playlist_track")
    @TableGenerator(name = "playlist_track", table = "sqlite_sequence",
            pkColumnName = "name", valueColumnName = "seq",
            pkColumnValue="Playlist_track",
            initialValue=1, allocationSize=1)

    private long TrackId;

    public Playlist_track(long playListId, long trackId) {
    }
}
