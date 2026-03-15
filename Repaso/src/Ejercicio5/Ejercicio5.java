package Ejercicio5;

import java.util.Stack;

public class Ejercicio5 {

    public static Stack<Integer> spliceStack(Stack<Integer> s, int i, int j) {
        Stack<Integer> extraidos = new Stack<>();
        Stack<Integer> restantes = new Stack<>();

        int size = s.size();

        for (int k = 0; k < size; k++) {
            int valor = s.remove(0); 

            if (k >= i && k < j) {
                extraidos.add(valor);
            } else {
                restantes.add(valor);
            }
        }

        s.addAll(restantes);

        return extraidos;
    }
}