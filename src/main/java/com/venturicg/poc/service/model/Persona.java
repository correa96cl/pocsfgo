package com.venturicg.poc.service.model;

import com.venturicg.poc.web.dto.PaisDTO;

import java.io.Serializable;

public class Persona implements Serializable {

    private String numeroDocumento;
    private String nombres;

    private String apellidos;

    private PaisDTO pais;

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public PaisDTO getPais() {
        return pais;
    }

    public void setPais(PaisDTO pais) {
        this.pais = pais;
    }
}
