package Ejercicio7;

public class Main {

    public static void main(String[] args) {

        Comparador<Integer> compNum = new ComparadorNumeros();
        System.out.println(compNum.comparar(8,3));

        Comparador<String> compStr = new ComparadorString();
        System.out.println(compStr.comparar("Ana","Luis"));

    }

}