package com.venturicg.poc.web.restcontroller;

import com.venturicg.poc.service.PersonaService;
import com.venturicg.poc.service.model.Persona;
import com.venturicg.poc.web.dto.PaisDTO;
import com.venturicg.poc.web.dto.PersonaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Controller para los endpoints de personas
 */
@RestController
@RequestMapping("/rest/personas")
public class PersonasRestController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("")
    public ResponseEntity<List<PersonaDTO>> obtenerPersonas() {
        return new ResponseEntity<>(personaService.obtenerPersonas().stream()
                .map(persona -> new PersonaDTO(persona.getNumeroDocumento(), persona.getNombres(), persona.getApellido(), persona.getPais()))
                .collect(Collectors.toList()), HttpStatus.OK);
    }

    @PostMapping("")
    @Transactional
    public void insertPersonas(@RequestBody Persona persona
            )  {

        try {
            System.out.println("Persona : " + persona.getPais().getId());
            PaisDTO paisDTO = new PaisDTO(persona.getPais().getId(), "");
            persona.setPais(paisDTO);
                personaService.insertPersona(persona);

        } catch(Exception e){
            e.printStackTrace();
            new ResponseEntity<Object>("Ocurrio un error en la inssercion ", HttpStatus.BAD_REQUEST);
        }
    }


    @DeleteMapping("")
    @Transactional
    public boolean deletePersonas(@RequestParam String numeroDocumento){
        System.out.println("Numero Documento : "+numeroDocumento);
        return personaService.deletePersona(numeroDocumento);
    }

    @PutMapping("")
    @Transactional
    public boolean updatePersonas(@RequestBody Persona persona){
        PaisDTO paisDTO = new PaisDTO(persona.getPais().getId(), "");
        persona.setPais(paisDTO);
        return personaService.updatePersona(persona);
    }

    }
