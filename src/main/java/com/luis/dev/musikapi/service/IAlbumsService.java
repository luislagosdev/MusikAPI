package com.luis.dev.musikapi.service;

import com.luis.dev.musikapi.entity.Album;

import java.util.List;

public interface IAlbumsService {

    // this method returns a list of Album Type, to searc in the DB all the records in the Album table
    List<Album> buscarTodos();
} // interface