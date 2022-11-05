package com.luis.dev.musikapi.controller;

import com.luis.dev.musikapi.entity.Album;
import com.luis.dev.musikapi.service.IAlbumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController                 // tell Spring this class is a REST API
@RequestMapping("/api")       // set the url
public class AlbumsController {

    @Autowired                              // to inject an instance of a class that implements this interface
    private IAlbumsService serviceAlbums;   // have a service class ready to be used in our methods in this controller


    @GetMapping("/albums")                    // set the url for this method
    public List<Album> buscarTodos() {          // this method returns a list of objects of type Album
        return serviceAlbums.buscarTodos();     // in JSON Format due to @RestController
    }

} // class
