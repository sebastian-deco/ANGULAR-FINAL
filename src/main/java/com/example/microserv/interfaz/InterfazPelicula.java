package com.example.microserv.interfaz;

import com.example.microserv.entity.EntidadPelicula;
import org.springframework.data.repository.CrudRepository;

public interface InterfazPelicula extends CrudRepository<EntidadPelicula, Integer> {
}
