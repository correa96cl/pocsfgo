package com.venturicg.poc.service;

import com.venturicg.poc.service.model.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> obtenerPersonas();

    boolean updatePersona(Persona persona);

    boolean deletePersona(String numeroDocumento);

    void insertPersona(Persona persona);

    Persona obtenerPersonaById(String numeroDocumento);
}
