package com.luis.dev.musikapi.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Albums")     // map the class Album to the table Albums in the DB
public class Album {

    // declare all the fields

    // set the primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // NO need to send ID number in POST method, ids added automatically
    private Integer id;

    private String titulo;
    private Date lanzado;
    private String genero;
    private Double precio;

    // getters and setters for each field

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getLanzado() {
        return lanzado;
    }

    public void setLanzado(Date lanzado) {
        this.lanzado = lanzado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    // override the toString() method for all the fields

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", lanzado=" + lanzado +
                ", genero='" + genero + '\'' +
                ", precio=" + precio +
                '}';
    }
} //class
