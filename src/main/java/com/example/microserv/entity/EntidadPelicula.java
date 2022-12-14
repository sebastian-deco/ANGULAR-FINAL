package com.example.microserv.entity;
import javax.persistence.*;

@Entity
@Table(name = "pelicula")
public class EntidadPelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula")
    private Integer aIdPelicula;

    @Column(name = "titulo")
    private String aIdTitulo;

    @Column(name = "categoria")
    private String aCategoria;

    public Integer getaIdPelicula() {
        return aIdPelicula;
    }

    public void setaIdPelicula(Integer aIdPelicula) {
        this.aIdPelicula = aIdPelicula;
    }

    public String getaIdTitulo() {
        return aIdTitulo;
    }

    public void setaIdTitulo(String aIdTitulo) {
        this.aIdTitulo = aIdTitulo;
    }

    public String getaCategoria() {
        return aCategoria;
    }

    public void setaCategoria(String aCategoria) {
        this.aCategoria = aCategoria;
    }



}
