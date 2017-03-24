package modelo;

import java.text.NumberFormat;

public class Intervalo {

    private double limiteInferior;
    private double limiteSuperior;
    private int cantidad = 0;

    public Intervalo(double limiteInferior, double limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getInstance();
        //Establecemos el numero de decimales 
        nf.setMaximumFractionDigits(4);
        //Convertimos el numero 
        
        String cadenaDeCierre = ")";
        if (limiteSuperior == 1) {
            cadenaDeCierre = "]";
        }
        return "[" + nf.format(limiteInferior) + " - " + nf.format(limiteSuperior) + cadenaDeCierre;
    }

    public boolean contieneNumero(double num) {
        return limiteInferior <= num && num < limiteSuperior;
    }

    public void increment() {
        cantidad++;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.limiteInferior) ^ (Double.doubleToLongBits(this.limiteInferior) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.limiteSuperior) ^ (Double.doubleToLongBits(this.limiteSuperior) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Intervalo other = (Intervalo) obj;
        if (Double.doubleToLongBits(this.limiteInferior) != Double.doubleToLongBits(other.limiteInferior)) {
            return false;
        }
        if (Double.doubleToLongBits(this.limiteSuperior) != Double.doubleToLongBits(other.limiteSuperior)) {
            return false;
        }
        return true;
    }

}
