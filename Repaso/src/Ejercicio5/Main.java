package Ejercicio5;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(60);

        System.out.println("Original antes: " + s);

        Stack<Integer> extraidos = Ejercicio5.spliceStack(s, 2, 5);

        System.out.println("Original después: " + s);
        System.out.println("Extraídos: " + extraidos);
    }
}