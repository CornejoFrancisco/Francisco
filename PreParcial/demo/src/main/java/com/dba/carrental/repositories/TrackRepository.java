package com.dba.carrental.repositories;

import com.dba.carrental.entities.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepository
extends JpaRepository<Track, Long> {
}
