package com.venturicg.poc.service.impl;

import com.venturicg.poc.repository.PersonaDAO;
import com.venturicg.poc.service.PersonaService;
import com.venturicg.poc.service.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService  {

    @Autowired
    private PersonaDAO personaDAO;


    @Override
    public List<Persona> obtenerPersonas() {
        return personaDAO.obtenerPersonas();
    }

    @Override
    public boolean updatePersona(Persona persona){
        return personaDAO.updatePersona(persona);
    }

    @Override
    public boolean deletePersona(String numeroDocumento) {
        return personaDAO.deletePersona(numeroDocumento);
    }

    @Override
    public void insertPersona(Persona persona) {
         personaDAO.insertPersona(persona);
    }

    @Override
    public Persona obtenerPersonaById(String numeroDocumento){
        return personaDAO.obtenerPersonaById(numeroDocumento);
    }
}
