package com.example.microserv.controller;

import com.example.microserv.entity.EntidadActor;
import com.example.microserv.interfaz.InterfazActor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actor")
@CrossOrigin(origins = "http://localhost:4200")
public class ControladoraActor {

    @Autowired
    private InterfazActor repo;

    @PostMapping
    public void Create(@RequestBody EntidadActor pEntidadActor){
        repo.save(pEntidadActor);
    }

    @GetMapping
    public List<EntidadActor> Read(){ return (List<EntidadActor>) repo.findAll();}

    @PutMapping
    public void Update(@RequestBody EntidadActor pEntidadActor) {
        repo.save(pEntidadActor);
    }

    @DeleteMapping(value = "/{codigo}")
    public void Delete(@PathVariable("codigo") Integer pId){
        repo.deleteById(pId);
    }

    @PutMapping(value = "/{codigo}")
    public void Update2(@PathVariable("codigo") Integer pId, @RequestBody EntidadActor json){
        EntidadActor rescate = repo.findById(pId).orElseThrow();

        if(!(json.getaNombreactor() ==null)){
            rescate.setaNombreactor(json.getaNombreactor());
        }

        repo.save(rescate);
    }
}
