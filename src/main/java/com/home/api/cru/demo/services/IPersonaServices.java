package com.home.api.cru.demo.services;

import com.home.api.cru.demo.model.Persona;

import java.util.List;

public interface IPersonaServices {

    Persona createPersona(Persona persona);

    List<Persona> getAll();

}
