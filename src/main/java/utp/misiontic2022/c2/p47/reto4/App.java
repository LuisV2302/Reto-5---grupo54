package utp.misiontic2022.c2.p47.reto4;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.ComprasPagadas;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.MaterialesConstruccion;
import utp.misiontic2022.c2.p47.reto4.vista.Modelo;

public class App {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();
    public static void main( String[] args ){
       /* System.out.println("Requerimiento 1");
        VistaRequerimientos.comprasPagadas();

        System.out.println("\nRequerimiento 2");
        VistaRequerimientos.materialesConstruccion();

        System.out.println("\nRequerimiento 3");
        VistaRequerimientos.comprasPagoParcial();*/
        Modelo modelo = new Modelo();
        try {
            ArrayList <ComprasPagadas> lista = controlador.comprasPagadas();
            Object matriz[][] = new Object [lista.size()][1];
            for (int i = 0; i < lista.size(); i++){
                matriz[i][0] = lista.get(i).getID_Compra();
            }
            Modelo.modelo = matriz;
            JTable tabla = new JTable(modelo);
            JTableHeader head = tabla.getTableHeader();
            TableColumnModel tcm = head.getColumnModel();
            TableColumn tabCM = tcm.getColumn(0);
            tabCM.setHeaderValue("ID_Compra");
            tabla.repaint();
            JScrollPane scroll = new JScrollPane(tabla);
            JOptionPane.showMessageDialog(null, scroll);
            scroll.add(tabla);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

/*
        try {
            ArrayList <MaterialesConstruccion> lista = controlador.materialesConstruccion();
            Object matriz[][] = new Object [lista.size()][1];
            for (int i = 0; i < lista.size(); i++){
                matriz[i][0] = lista.get(i).getID_Compra();
            }
            Modelo.modelo = matriz;
            JTable tabla = new JTable(modelo);
            JTableHeader head = tabla.getTableHeader();
            TableColumnModel tcm = head.getColumnModel();
            TableColumn tabCM = tcm.getColumn(0);
            tabCM.setHeaderValue("ID_Compra");
            tabla.repaint();
            JScrollPane scroll = new JScrollPane(tabla);
            JOptionPane.showMessageDialog(null, scroll);
        
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
    }
}
