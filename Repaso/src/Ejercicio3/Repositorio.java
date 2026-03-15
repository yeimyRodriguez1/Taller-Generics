package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Repositorio<T> implements Iterable<T> {

    private List<T> elementos;

    public Repositorio() {
        elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T obtener(int indice) {
        return elementos.get(indice);
    }

    //Método obligatorio como estamos implementando iterable 
    @Override
    public Iterator<T> iterator() {
        return elementos.iterator();
    }

    public void recorrerReverso() {
        ListIterator<T> it = elementos.listIterator(elementos.size());

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }

    //Usa Iterator porque solo vas hacia adelante.
    public void recorrerAdelante(){
        Iterator<T> el = elementos.iterator();

        while (el.hasNext()){
            System.out.println(el.next());
        }

    }

    public void recorrer(){
        ListIterator<T> uy = elementos.listIterator(); 
        while (uy.hasNext()){
            System.out.println(uy.next());
        }
    }
}
/*| Tipo         | Puede avanzar | Puede retroceder |
| -------------- | ------------- | ---------------- |
| `Iterator`     | Sí            |  No             |
| `ListIterator` |  Sí          |  Sí             |
 
*Iterator: 
hasNext()
next()
remove()

*ListIterator:

hasNext()
next()

hasPrevious()
previous()

nextIndex()
previousIndex()
*/