package com.dba.carrental.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor(force = true)
@Data
@Entity
@Table(name = "tracks")
public class Track {
    @Id
    @GeneratedValue(generator = "tracks")
    @TableGenerator(name = "tracks", table = "sqlite_sequence",
            pkColumnName = "name", valueColumnName = "seq",
            pkColumnValue="tracks",
            initialValue=1, allocationSize=1)
    private long TrackId;

    private String Name;

    @Column(name = "AlbumId")
    private Integer album;

    @Column(name = "MediaTypeId")
    private Integer mediaTypel;

    @Column(name = "GenreId")
    private Integer genre;

    @Column(name = "Composer")
    private Integer composer;

    @Column(name = "Miliseconds")
    private Integer miliSeconds;

    @Column(name = "Bytes")
    private Integer bytes;

    @Column(name = "UnitPrice")
    private Integer unitPrice;

    @OneToMany(mappedBy = "track", fetch = FetchType.LAZY)
    private List<Track> tracks;


    public Track(long trackId, String name, Integer album, Integer mediaTypel, Integer genre, Integer composer, Integer miliSeconds, Integer bytes, Integer unitPrice) {
    }
}
