package com.luis.dev.musikapi.repository;

import com.luis.dev.musikapi.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;

// entity type = Album
// primary data type = Integer
public interface AlbumsRepository extends JpaRepository<Album, Integer> {

} // interface

