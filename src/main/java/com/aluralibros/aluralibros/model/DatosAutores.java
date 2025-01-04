package com.aluralibros.aluralibros.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record DatosAutores(

        @JsonAlias("name") String nombre,
        @JsonAlias("birth_year") Integer ano_nacimiento,
        @JsonAlias("death_year") Integer ano_muerte
) {
}
