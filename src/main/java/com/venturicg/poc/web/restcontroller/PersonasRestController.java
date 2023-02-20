package com.venturicg.poc.web.restcontroller;

import com.venturicg.poc.service.PersonaService;
import com.venturicg.poc.web.dto.PersonaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
                .map(persona -> new PersonaDTO(persona.getNumeroDocumento(), persona.getNombres(), persona.getApellidos(), persona.getPais()))
                .collect(Collectors.toList()), HttpStatus.OK);
    }

    }
