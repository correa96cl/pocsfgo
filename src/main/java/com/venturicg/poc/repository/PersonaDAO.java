package com.venturicg.poc.repository;


import com.venturicg.poc.service.model.Pais;
import com.venturicg.poc.service.model.Persona;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonaDAO {

    @Select("select * from persona")
    List<Persona> obtenerPersonas();

    @Update("UPDATE persona SET nombre = #{nombre}, apellido = #{apellido}, idPais = #{idPais} WHERE numeroDocumento = #{numeroDocumento}")
    boolean updatePersona(Persona persona);

    @Delete("DELETE persona FROM numeroDocumento = #{numeroDocumento}")
    boolean deletePersona(Persona persona);

    @Insert("INSERT INTO persona (numeroDocumento, nombre, apellido, idPais) VALUES(#{numeroDocumento}, #{nombre}, #{apellido}, #{idPais})")
    void insertPersona(Persona persona);
}
