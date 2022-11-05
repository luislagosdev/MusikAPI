package com.luis.dev.musikapi.service.jpa;

import com.luis.dev.musikapi.entity.Album;
import com.luis.dev.musikapi.repository.AlbumsRepository;
import com.luis.dev.musikapi.service.IAlbumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumsService implements IAlbumsService {

    // to implement this interface we need the repository, so declare a repository variable
    @Autowired
    private AlbumsRepository repoAlbums;
    // @Autowired --> to inject in the variable repoAlbums one instance of our repository AlbumsRepository
    // then we can use the variable repoAlbums to implement the methods.

    @Override
    public List<Album> buscarTodos() {
        // this method returns all the records from the DB
        return repoAlbums.findAll();
    }
} // interface
