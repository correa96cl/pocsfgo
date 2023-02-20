package com.venturicg.poc.repository;


import com.venturicg.poc.service.model.Pais;
import com.venturicg.poc.service.model.Persona;
import com.venturicg.poc.web.dto.PaisDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonaDAO {

    @Results({
            @Result(property = "numeroDocumento", column = "numeroDocumento"),
            @Result(property = "nombres", column = "nombres"),
            @Result(property = "apellido", column = "apellido"),
            @Result(property = "pais", column = "id", one= @One(select = "selectPaisById"))})
    @Select("select numeroDocumento, nombres, apellido, idPais from persona")
    List<Persona> obtenerPersonas();

    @Select("select id, nombre from pais where id = 'BR'")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "nombre", column = "nombre"),
    })
    Pais selectPaisById(@Param("id") String idPais);

    @Update("UPDATE persona SET nombres = #{nombres}, apellido = #{apellido}, idPais = #{pais.id} WHERE numeroDocumento = #{numeroDocumento}")
    boolean updatePersona(Persona persona);

    @Delete("DELETE FROM persona WHERE numeroDocumento = #{numeroDocumento}")
    boolean deletePersona(String numeroDocumento);

    @Insert("INSERT INTO persona (numeroDocumento, nombres, apellido, idPais) VALUES(#{numeroDocumento}, #{nombres}, #{apellido}, #{pais.id})")
    void insertPersona(Persona persona);

    @Select("select * from persona where numeroDocumento = #{numeroDocumento} ")
    Persona obtenerPersonaById(String numeroDocumento);
}
