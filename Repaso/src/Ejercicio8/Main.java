package Ejercicio8;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);

        Pair<Stack<Integer>, Stack<Integer>> resultado = Ejercicio8.splitStack(s, 2);

        System.out.println("Primera subpila: " + resultado.getPrimero());
        System.out.println("Segunda subpila: " + resultado.getSegundo());
    }
}