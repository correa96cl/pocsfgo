package com.venturicg.poc.web.dto;

import java.io.Serializable;

public class PersonaDTO implements Serializable {

    private String numeroDocumento;
    private String nombres;

    private String apellidos;

    private PaisDTO pais;


    public PersonaDTO(String numeroDocumento, String nombres, String apellidos, PaisDTO pais) {
        this.numeroDocumento = numeroDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.pais = pais;
    }

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
