package com.example.microserv.controller;

import com.example.microserv.entity.EntidadPelicula;
import com.example.microserv.interfaz.InterfazPelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pelicula")
@CrossOrigin(origins = "http://localhost:4200")
public class ControladoraPelicula {

    @Autowired
    private InterfazPelicula repo;

    @PostMapping
    public void Create(@RequestBody EntidadPelicula pEntidadPelicula){
        repo.save(pEntidadPelicula);
    }

    @GetMapping
    public List<EntidadPelicula> Read(){ return (List<EntidadPelicula>) repo.findAll();}

    @PutMapping
    public void Update(@RequestBody EntidadPelicula pEntidadPelicula) {
        repo.save(pEntidadPelicula);
    }

    @DeleteMapping(value = "/{codigo}")
    public void Delete(@PathVariable("codigo") Integer pId){
        repo.deleteById(pId);
    }

}
