package com.dba.carrental.repositories;

import com.dba.carrental.entities.Playlist_track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistTrackRepository
extends JpaRepository<Playlist_track, Long> {
}
