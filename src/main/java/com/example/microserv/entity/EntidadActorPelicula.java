package com.example.microserv.entity;
import javax.persistence.*;

@Entity
@Table(name = "actorpelicula")
public class EntidadActorPelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_actorpelicula")
    private Integer aIdActorpelicula;

    @Column(name = "id_actor")
    private Integer aIdActor;

    @Column(name = "id_pelicula")
    private Integer aIdPelicula;

    public Integer getaIdActorpelicula() {
        return aIdActorpelicula;
    }

    public void setaIdActorpelicula(Integer aIdActorpelicula) {
        this.aIdActorpelicula = aIdActorpelicula;
    }

    public Integer getaIdActor() {
        return aIdActor;
    }

    public void setaIdActor(Integer aIdActor) {
        this.aIdActor = aIdActor;
    }

    public Integer getaIdPelicula() {
        return aIdPelicula;
    }

    public void setaIdPelicula(Integer aIdPelicula) {
        this.aIdPelicula = aIdPelicula;
    }



}

