package com.home.api.cru.demo.controller;

import com.home.api.cru.demo.model.Persona;
import com.home.api.cru.demo.services.PersonaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/personas")
public class PersonaController {

    @Autowired
    private PersonaServices personaServices;


    @GetMapping
    public ResponseEntity<List<Persona>>  getAllPersona(){
        return  ResponseEntity.ok().body(personaServices.getAll());
    }


    //@PostMapping
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Persona> createPersona(@RequestBody Persona persona){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.personaServices.createPersona(persona));

    }

}

