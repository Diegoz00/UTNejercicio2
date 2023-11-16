package org.example;



import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public interface Interface {
    public static List<String> cambiarAMayus(List<String> lista, Function<String, String> cambiarMayus) {
        List<String> resultado = new ArrayList<>();
        for (String cadena : lista) {
            resultado.add(cambiarMayus.apply(cadena));
        }
        return resultado;
    }
}
