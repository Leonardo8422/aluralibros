package com.aluralibros.aluralibros.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibros(
        @JsonAlias("count") Long contador,
        @JsonAlias("next") String pag_siguiente,
        @JsonAlias("previous") String pag_anterior,
        @JsonAlias("results") List<LibroResults> libro
)
{
}
