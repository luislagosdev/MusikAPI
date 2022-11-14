package com.luis.dev.musikapi.controller;

import com.luis.dev.musikapi.entity.Album;
import com.luis.dev.musikapi.service.IAlbumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController                 // tell Spring this class is a REST API
@RequestMapping("/api")       // set the url
public class AlbumsController {

    @Autowired                              // to inject an instance of a class that implements this interface
    private IAlbumsService serviceAlbums;   // have a service class ready to be used in our methods in this controller


    @GetMapping("/albums")                    // set the url for this method
    public List<Album> buscarTodos() {          // GET: this method returns a list of objects of type Album
        return serviceAlbums.buscarTodos();     // in JSON Format due to @RestController
    }

    // POST
    // this method returns an object of type Album
    @PostMapping("/albums")
    public Album guardar(@RequestBody Album album) {    // @RequestBody --> look in the body for JSON data and
        serviceAlbums.guardar(album);                   // execute the data-binding to the object of that type
        return album;   // return the same object that we receive as parameter
    }

    @PutMapping("/albums")                               // to update the DB
    public Album modificar(@RequestBody Album album) {     // data is sent in the body and converted to JSON automatically
        serviceAlbums.guardar(album);
        return album;
    }

} // class
