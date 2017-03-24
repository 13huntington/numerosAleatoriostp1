package modelo;

public class GeneradorLineal implements GeneradorNumerosAleatorios {

    private double a;
    private double c;
    private double m;
    private double semilla;
    private double X0;

    public GeneradorLineal(double a, double c, double m, double semilla) {
        this.a = a;
        this.c = c;
        this.m = m;
        this.semilla = semilla;
        X0 = semilla;
    }

    @Override
    public double getSiguiente() {
        X0 = (a * X0 + c) % m;

        return X0 / (m-1);
    }

    @Override
    public double[] getSiguientes(int cantidad) {
        double[] numerosGenerados = new double[cantidad];

        for (int i = 0; i < numerosGenerados.length; i++) {
            numerosGenerados[i] = this.getSiguiente();
        }

        return numerosGenerados;
    }

    @Override
    public void reiniciar() {
        this.X0 = semilla;
    }
    
    @Override
    public double[] agregarUnoMas(double[] numeros) {
        double nuevaMatriz[] = new double[numeros.length + 1];

        System.arraycopy(numeros, 0, nuevaMatriz, 0, numeros.length);

        nuevaMatriz[nuevaMatriz.length - 1] = this.getSiguiente();

        return nuevaMatriz;
    }
}
