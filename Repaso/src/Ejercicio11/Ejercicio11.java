package Ejercicio11;

import java.util.Queue;
import java.util.LinkedList;

public class Ejercicio11 {

    public static <T> Queue<T> mergeQueues(Queue<T> q1, Queue<T> q2) {

        Queue<T> resultado = new LinkedList<>();

        while (!q1.isEmpty()) {
            resultado.add(q1.poll());
        }

        while (!q2.isEmpty()) {
            resultado.add(q2.poll());
        }

        return resultado;
    }
}