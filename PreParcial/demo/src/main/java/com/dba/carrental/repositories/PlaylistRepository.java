package com.dba.carrental.repositories;

import com.dba.carrental.entities.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository
    extends JpaRepository<Playlist, Long> {
}
