package com.aluralibros.aluralibros.menusolicitudes;

public class MostrarMenu {

    public void mostrarMenuOpciones(){
        opcionDobleLinea();
        System.out.println("""
                          
               1 - Grardar Libro en Base de datos
               2 - Presentar libros registrados
               3 - Presentar lista de autores registrados
               4 - Presentar autores vivos en determinado año
               5 - Buscar libro por idioma
           
               0 - Salir                               
                """);
        opcionDobleLinea();
    }

    public void opcionUnaLinea(){
        System.out.println("-------------------------------------------------");
    }

    public void opcionDobleLinea(){
        System.out.println("============================================================================================");
    }
}
