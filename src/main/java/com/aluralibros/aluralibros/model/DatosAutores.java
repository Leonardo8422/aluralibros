package com.aluralibros.aluralibros.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutores(

        @JsonAlias("name") String nombre,
        @JsonAlias("birth_year") Integer ano_nacimiento,
        @JsonAlias("death_year") Integer ano_muerte
) {
}
