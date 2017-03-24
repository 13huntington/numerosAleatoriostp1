
package modelo;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ModeloTablaFrecuencia  extends AbstractTableModel{
    private ArrayList<Intervalo> frecuencia= new ArrayList<>();
        
    @Override
    public int getRowCount() {
        return frecuencia.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
          
        switch (columnIndex) {
            case 0:
                return frecuencia.get(rowIndex).toString();
            case 1:
                return frecuencia.get(rowIndex).getCantidad();
           
        }
        return null;
      
       
    }

    public void setFrecuenciaRepeticion(ArrayList<Intervalo> frecuencia) {
        this.frecuencia=frecuencia;
        this.fireTableRowsInserted(0, frecuencia.size()-1);
    }
    
}
