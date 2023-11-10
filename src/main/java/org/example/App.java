package org.example;



import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.example.Interface.cambiarAMayus;

public class App {

    public static void main(String[] args) {


        List<String> listaDeCadenas = Arrays.asList("Hola", "Mundo", "Java");

        // Define:función lambda
        Function<String, String> transformadorMayusculas = String::toUpperCase;

        // Utilizar: función lambda para transformar
        List<String> listaEnMayusculas = cambiarAMayus(listaDeCadenas, transformadorMayusculas);

        // Imprimir: resultado
        listaEnMayusculas.forEach(System.out::println);
    }
}
