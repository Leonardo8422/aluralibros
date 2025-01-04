package com.aluralibros.aluralibros.repositorio;

import com.aluralibros.aluralibros.model.Lenguaje;
import com.aluralibros.aluralibros.model.Libros;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface LibroRepositorio extends JpaRepository<Libros, Long> {
    @Query("SELECT l FROM Libro l JOIN l.autor a WHERE l.titulo = :titulo AND a.nombre = :nombreAutor")
    Optional<Libros> findByTituloAndAutor(@Param("titulo") String titulo, @Param("nombreAutor") String nombreAutor);

    List<Libros> findByLenguaje(Lenguaje lenguaje);
}
