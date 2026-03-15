package Ejercicio8;

import java.util.Stack;

public class Ejercicio8 {

    public static Pair<Stack<Integer>, Stack<Integer>> splitStack(Stack<Integer> s, int i) {
        Stack<Integer> primera = new Stack<>();
        Stack<Integer> segunda = new Stack<>();

        for (int index = 0; index < s.size(); index++) {
            if (index < i) {
                primera.add(s.get(index));
            } else {
                segunda.add(s.get(index));
            }
        }

        return new Pair<>(primera, segunda);
    }
}