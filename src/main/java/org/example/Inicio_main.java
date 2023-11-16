package org.example;



import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.example.Interface.cambiarAMayus;

public class Inicio_main {

    public static void main(String[] args) {

        List<String> listaDeCadenas = Arrays.asList("Diego", "Benjamin", "Lautaro");

        // Define:función lambda
        Function<String, String> transformadorMayusculas = String::toUpperCase;

        // Utilizar: función lambda para transformar
        List<String> listaEnMayusculas = cambiarAMayus(listaDeCadenas, transformadorMayusculas);

        // Imprimir: resultado
        listaEnMayusculas.forEach(System.out::println);

    }
}