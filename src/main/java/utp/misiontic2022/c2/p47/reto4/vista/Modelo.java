package utp.misiontic2022.c2.p47.reto4.vista;

import javax.swing.table.AbstractTableModel;

public class Modelo extends AbstractTableModel {

    public static Object modelo[][] = { 
            { "uno", "dos", "tres", "cuatro" }, 
            { "cinco", "seis", "siete", "ocho" },
            { "nueve", "diez", "once", "doce" } };

    public Modelo() {
        addTableModelListener(evt -> {
            for (int i = 0; i < modelo.length; i++) {
                for (int j = 0; j < modelo[0].length; j++) {
                    System.out.print(modelo[i][j] + " ");
                }
                System.out.println();
            }
        });
        
    }


    @Override
    public int getRowCount() {
        return modelo.length;
    }

    @Override
    public int getColumnCount() {
        return modelo[0].length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return modelo[rowIndex][columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       modelo[rowIndex][columnIndex] = aValue;
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }


}