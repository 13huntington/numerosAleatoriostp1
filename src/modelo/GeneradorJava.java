package modelo;

import java.util.Random;

public class GeneradorJava implements GeneradorNumerosAleatorios {

    private Random rnd = new Random();
    private double semilla;

    public GeneradorJava(double semilla) {
        this.semilla = semilla;
        rnd = new Random((long) semilla);
    }

    @Override
    public double getSiguiente() {
        return rnd.nextDouble();

    }

    @Override
    public double[] getSiguientes(int cantidad) {
        double[] numerosAleatorios = new double[cantidad];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = rnd.nextDouble();
        }

        return numerosAleatorios;
    }

    @Override
    public void reiniciar() {
        rnd = new Random((long) semilla);
    }

    @Override
    public double[] agregarUnoMas(double[] numeros) {
        double nuevaMatriz[] = new double[numeros.length + 1];

        System.arraycopy(numeros, 0, nuevaMatriz, 0, numeros.length);

        nuevaMatriz[nuevaMatriz.length - 1] = this.getSiguiente();

        return nuevaMatriz;
    }
}
