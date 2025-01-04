package com.aluralibros.aluralibros.principal;

import com.aluralibros.aluralibros.model.DatosLibros;
import com.aluralibros.aluralibros.model.Libros;
import com.aluralibros.aluralibros.service.ConsumoAPI;
import com.aluralibros.aluralibros.service.ConvierteDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "https://gutendex.com/books?name=";
    private ConvierteDatos conversor = new ConvierteDatos();
    private List<DatosLibros> datosLibros = new ArrayList<>();
    private String Datos;


    public void muestraElMenu() {
        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    1 - Buscar libro por titulo
                    
                                  
                    0 - Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    buscarLibro();
                    break;


                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

    }

    private DatosLibros getDatosLibros() {
        System.out.println("Busca libro por titulo");
        var nombreLibro = teclado.nextLine();
        var json = consumoApi.obtenerDatos(URL_BASE + nombreLibro);
        System.out.println(json);
        DatosLibros datos = conversor.obtenerDatos(json, DatosLibros.class);
        return datos;
    }
    private void buscarLibro() {
        DatosLibros datos = getDatosLibros();
        Libros libros = new Libros(datos);
        //repository.save(serie);
        datosLibros.add(datos);
        System.out.println(datos);
    }
}
