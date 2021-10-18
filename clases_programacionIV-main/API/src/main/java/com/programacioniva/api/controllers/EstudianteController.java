package com.programacioniva.api.controllers;

import com.programacioniva.api.entidades.Estudiante;
import com.programacioniva.api.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class EstudianteController {

    //Inyector de Dependencias.
    @Autowired
    EstudianteRepository repository;

    //*************************************************************
    @GetMapping("inicio")//GET
    @ResponseBody
    public List<Estudiante> inicio(){
        return repository.findAll();
    }
    //*************************************************************
    @PostMapping("/registrar")//POST
    @ResponseBody
    public Estudiante nuevo(@RequestBody Estudiante estudiante){
        repository.save(estudiante);
        return estudiante;
    }
    //*************************************************************
    @PutMapping("/actualizar/{id}")//PUT
    @ResponseBody
    public Estudiante actualizar(@RequestBody Estudiante newEstudiante, @PathVariable int id){
        return repository.findById(id).map(estudiante -> {
            estudiante.setNombre(newEstudiante.getNombre());
            estudiante.setDireccion(newEstudiante.getDireccion());
            return repository.save(estudiante);
        }).orElseGet(() ->{
            newEstudiante.setId(id);
            return repository.save(newEstudiante);
        });
    }
    //*************************************************************
    @DeleteMapping("/eliminar/{id}")//DELETE
    @ResponseBody
    public void eliminar(@PathVariable int id){
        try {
            repository.deleteById(id);
            System.out.println("Estudiante eliminado con exito: " + id);
        }catch (Exception ex){
            System.out.println(">Ha ocurrido un error, posiblemente no exista ese ID: " + ex);
        }
    }
}
