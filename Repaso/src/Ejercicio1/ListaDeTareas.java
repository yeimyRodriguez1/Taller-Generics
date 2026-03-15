package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ListaDeTareas {

    public List<Tarea<Date>> tareas;

    public ListaDeTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTareas(Tarea<Date> tarea) {
        tareas.add(tarea);
    }

    public List<Tarea<Date>> obtenerPorPrioridad(int prioridad) {
        List<Tarea<Date>> resultado = new ArrayList<>();

        for (Tarea<Date> t : tareas) {
            if (t.getPrioridad() == prioridad) {
                resultado.add(t);
            }
        }
        return resultado;
    }

    public void mostrarTareasOrdenadas() {

        Collections.sort(tareas, new Comparator<Tarea<Date>>() {
            @Override
            public int compare(Tarea<Date> t1, Tarea<Date> t2) {
                return t1.getFechaVencimiento().compareTo(t2.getFechaVencimiento());
            }

        });

        for (Tarea<Date> t : tareas) {
            System.out.println(t);
        }
    }
}