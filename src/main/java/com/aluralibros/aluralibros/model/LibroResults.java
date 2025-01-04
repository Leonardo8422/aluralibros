package com.aluralibros.aluralibros.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

import java.util.Collections;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LibroResults(
        //@JsonAlias("id") Long id,
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<DatosAutores> autor,
        @JsonAlias("subjects") List<String> temas,
        @JsonAlias("languages") List<String> lenguaje,
        @JsonAlias("copyright") String derechos_autor,
        @JsonAlias("media_type") String tipo_de_medio,
        @JsonAlias("download_count") Long contador_descargas

){
    @Override
    public List<DatosAutores> autor() {
        return autor == null ? Collections.emptyList() : autor;
    }

    @Override
    public List<String> temas() {
        return temas == null ? Collections.emptyList() : temas;
    }

    @Override
    public List<String> lenguaje() {
        return lenguaje == null ? Collections.emptyList() : lenguaje;
    }

}
