package com.venturicg.poc.repository;


import com.venturicg.poc.service.model.Pais;
import com.venturicg.poc.service.model.Persona;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonaDAO {

    @Select("select * from persona")
    List<Persona> obtenerPersonas();

    @Update("UPDATE persona SET nombres = #{nombres}, apellido = #{apellido}, idPais = #{pais.id} WHERE numeroDocumento = #{numeroDocumento}")
    boolean updatePersona(Persona persona);

    @Delete("DELETE FROM persona WHERE numeroDocumento = #{numeroDocumento}")
    boolean deletePersona(String numeroDocumento);

    @Insert("INSERT INTO persona (numeroDocumento, nombres, apellido, idPais) VALUES(#{numeroDocumento}, #{nombres}, #{apellido}, #{pais.id})")
    void insertPersona(Persona persona);

    @Select("select * from persona where numeroDocumento = #{numeroDocumento} ")
    Persona obtenerPersonaById(String numeroDocumento);
}
