package com.aluralibros.aluralibros.dto;

import com.aluralibros.aluralibros.model.Lenguaje;

public record LibroDTO(
        String titulo,
        Lenguaje lenguaje,
        Long contador_descargas
) {
}
