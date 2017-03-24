
package modelo;

public interface GeneradorNumerosAleatorios {
        double getSiguiente();
        double[] getSiguientes(int cantidad);
        void reiniciar();

    public double[] agregarUnoMas(double[] numeros);

   
}
