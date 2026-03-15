package Ejercicio6;
/*
si le mandas una lista de enteros, te devuelva el mayor

si le mandas una lista de strings, te devuelva el mayor según orden natural

si le mandas una lista de cualquier otro objeto comparable, también funcione
*/

import java.util.List;

public class Utilidades {

    public static <T extends Comparable<T>> T maximo(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            return null;
        }

        T max = lista.get(0);

        for (T elemento : lista) {
            if (elemento.compareTo(max) > 0) {
                max = elemento;
            }
        }

        return max;
    }
}