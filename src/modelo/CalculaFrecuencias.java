package modelo;

import java.util.ArrayList;

public class CalculaFrecuencias {

    public static ArrayList<Intervalo> getFrecuencia(double aleatorios[], int cantidadIntervalos) {
        ArrayList<Intervalo> frecuencia = new ArrayList<>(cantidadIntervalos);

        double longitud = 1.0 / cantidadIntervalos;
        double inicio = 0;

        for (int i = 0; i < cantidadIntervalos; i++) {
            if (i == cantidadIntervalos - 1) {
                frecuencia.add(new Intervalo(inicio, 1.0));
            } else {
                frecuencia.add(new Intervalo(inicio, inicio + longitud));
                inicio = inicio + longitud;
            }
        }

        for (double n : aleatorios) {
            for (Intervalo intervalo : frecuencia) {
                if (intervalo.contieneNumero(n)) {
                    intervalo.increment();
                    break;
                }
            }
        }

        return frecuencia;
    }
}
