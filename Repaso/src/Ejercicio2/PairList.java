package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class PairList<K, V> {

    public List<Pair<K, V>> lista;

    public PairList() {
        lista = new ArrayList<>();
    }

    public void agregarPares(K clave, V valor) {
        lista.add(new Pair<>(clave, valor));
    }

    public boolean eliminar(K clave) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getClave().equals(clave)) {
                lista.remove(i);
                return true;
            }
        }
        return false;
    }

    public V obtenerPares(K clave) {
        for (Pair<K, V> par : lista) {
            if (par.getClave().equals(clave)) {
                return par.getValor();
            }
        }
        return null;
    }

    public void mostrarTodos() {
        for (Pair<K, V> par : lista) {
            System.out.println(par);
        }
    }

}
