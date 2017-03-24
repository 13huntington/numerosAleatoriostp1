
package modelo;

import java.math.RoundingMode;
import java.text.NumberFormat;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaAleatoriosGenerados  extends AbstractTableModel{
    private double[] numerosAleatorios;
   
    public ModeloTablaAleatoriosGenerados() {
        numerosAleatorios=new double[0];
    }

    @Override
    public int getRowCount() {
        return numerosAleatorios.length;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        NumberFormat nf=NumberFormat.getInstance();
        nf.setMaximumFractionDigits(4);
         nf.setRoundingMode(RoundingMode.DOWN);
        switch(columnIndex){
            case 0:
                return rowIndex;
            case 1:
                return nf.format(numerosAleatorios[rowIndex]);
                
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "i";
                
            case 1:
                return "Aleatorio";
        }
        return null;
    }

    public void setNumeros(double[] siguientes) {
        this.numerosAleatorios=siguientes;
        this.fireTableRowsInserted(0,siguientes.length-1);
     
    }
    public double[] getNumeros(){
        return numerosAleatorios;
    }

    public void agregarNumero(double numeroNuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
