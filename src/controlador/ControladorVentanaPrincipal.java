package controlador;

import modelo.CalculaFrecuencias;
import modelo.GeneradorJava;
import modelo.GeneradorLineal;
import modelo.GeneradorMultiplicativo;
import modelo.GeneradorNumerosAleatorios;
import modelo.ModeloTablaAleatoriosGenerados;
import modelo.ModeloTablaFrecuencia;

public class ControladorVentanaPrincipal {

    GeneradorNumerosAleatorios generadorNumeros;
    ModeloTablaAleatoriosGenerados modeloTablaNumerosAleatorios;
    ModeloTablaFrecuencia modeloTablaFrecuencia;

    
    public ControladorVentanaPrincipal(ModeloTablaAleatoriosGenerados modeloTablaAleatorios, ModeloTablaFrecuencia modeloTablaFrecuencia) {
        this.modeloTablaFrecuencia = modeloTablaFrecuencia;
        this.modeloTablaNumerosAleatorios = modeloTablaAleatorios;
    }

    public void generarNumerosAleatoriosJava(int cantidadNumeros, int cantidadIntervalos, double semilla) {
        generadorNumeros = new GeneradorJava(semilla);
        double[] numerosAleatorios = generadorNumeros.getSiguientes(cantidadNumeros);
        modeloTablaNumerosAleatorios.setNumeros(numerosAleatorios);
        modeloTablaFrecuencia.setFrecuenciaRepeticion(CalculaFrecuencias.getFrecuencia(numerosAleatorios, cantidadIntervalos));
    }

    public void generarNumerosAleatoriosCongruencialLineal(double a, double c, double m, int cantidadNumeros, int cantidadIntervalos, double semilla) {
        generadorNumeros = new GeneradorLineal(a, c, m, semilla);
        double[] numerosAleatorios = generadorNumeros.getSiguientes(cantidadNumeros);
        modeloTablaNumerosAleatorios.setNumeros(numerosAleatorios);
        modeloTablaFrecuencia.setFrecuenciaRepeticion(CalculaFrecuencias.getFrecuencia(numerosAleatorios, cantidadIntervalos));

    }

    public void generarNumerosAleatoriosCongruencialMultiplicativo(double a, double m, int cantidadNumeros, int cantidadIntervalos, double semilla) {
        generadorNumeros = new GeneradorMultiplicativo(a, m, semilla);
        double[] numerosAleatorios = generadorNumeros.getSiguientes(cantidadNumeros);
        modeloTablaNumerosAleatorios.setNumeros(numerosAleatorios);
        modeloTablaFrecuencia.setFrecuenciaRepeticion(CalculaFrecuencias.getFrecuencia(numerosAleatorios, cantidadIntervalos));

    }

    public void mostrarSiguiente() {       
        double[] numerosAleatorios = generadorNumeros.agregarUnoMas(modeloTablaNumerosAleatorios.getNumeros());
        modeloTablaNumerosAleatorios.setNumeros(numerosAleatorios);
        modeloTablaFrecuencia.setFrecuenciaRepeticion(CalculaFrecuencias.getFrecuencia(numerosAleatorios,modeloTablaFrecuencia.getRowCount() ));

    }

}
