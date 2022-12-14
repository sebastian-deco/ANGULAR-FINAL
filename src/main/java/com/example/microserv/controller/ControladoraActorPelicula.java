package com.example.microserv.controller;

import com.example.microserv.entity.EntidadActorPelicula;
import com.example.microserv.interfaz.InterfazActorPelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actorpelicula")
@CrossOrigin(origins = "http://localhost:4200")
public class ControladoraActorPelicula {

    @Autowired
    private InterfazActorPelicula inter;

    @PostMapping
    public void Create(@RequestBody EntidadActorPelicula pEntidadActorPelicula) {
        inter.save(pEntidadActorPelicula);
    }

    @GetMapping
    public List<EntidadActorPelicula> Read() {
        return (List<EntidadActorPelicula>) inter.findAll();
    }

    @PutMapping
    public void Update(@RequestBody EntidadActorPelicula pEntidadActorPelicula){
        inter.save(pEntidadActorPelicula);
    }

    @DeleteMapping("/{codigo}")
    public void Delete(@PathVariable("codigo") Integer pId){
        inter.deleteById(pId);
    }
}
