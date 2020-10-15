package com.home.api.cru.demo.services;

import com.home.api.cru.demo.model.Persona;
import com.home.api.cru.demo.repository.IPersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServices implements IPersonaServices {

    @Autowired
    private IPersonasRepository personasRepository;

    @Override
    public Persona createPersona(Persona persona) {
        return personasRepository.save(persona);
    }

    @Override
    public List<Persona> getAll() {
        return this.personasRepository.findAll();
    }




}
