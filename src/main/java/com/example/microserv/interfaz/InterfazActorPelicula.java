package com.example.microserv.interfaz;

import com.example.microserv.entity.EntidadActorPelicula;
import org.springframework.data.repository.CrudRepository;

public interface InterfazActorPelicula extends CrudRepository<EntidadActorPelicula, Integer> {
}
