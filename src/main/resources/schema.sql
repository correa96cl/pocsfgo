create table pais(
    id varchar(2),
    nombre varchar(50),
    primary key (id)
);

create table persona(
    numeroDocumento varchar(20),
    nombres varchar(2000),
    apellido varchar(2000),
    idPais varchar(2),
    primary key (numeroDocumento),
    CONSTRAINT "fkey_persona_pais" FOREIGN KEY (idPais) REFERENCES pais (id) ON DELETE RESTRICT ON UPDATE CASCADE

);

