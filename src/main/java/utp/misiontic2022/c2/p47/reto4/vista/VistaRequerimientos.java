package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.ComprasPagadas;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.MaterialesConstruccion;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.ComprasPagoParcial;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void comprasPagadas(){
        System.out.println("Conocer el id de las compras que no estén pagadas y su proveedor sea JUMBO");
        System.out.println("ID_Compra  Proveedor");
        try {
            ArrayList<ComprasPagadas> resultado = controlador.comprasPagadas();
            for (ComprasPagadas comprasPagadas:resultado){
                System.out.print(comprasPagadas.getID_Compra()+" ");
                System.out.println(comprasPagadas.getProveedor());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void materialesConstruccion(){
        System.out.println("Conocer el id de todas las compras cuyo precio por unidad de su material de construcción sea inferior a 1100");
        System.out.println("ID_Compra  NombreMaterial");
        try {
            ArrayList<MaterialesConstruccion> resultado2 = controlador.materialesConstruccion();
            for (MaterialesConstruccion materialesConstruccion:resultado2){
                System.out.print(materialesConstruccion.getID_Compra()+" ");
                System.out.println(materialesConstruccion.getNombreMaterial());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void comprasPagoParcial(){
        System.out.println("Obtener el id de la compra y el año de las compras pagadas parcialmente y en el mes '02'");
        System.out.println("ID_Proyecto  Fecha");
        try {
            ArrayList<ComprasPagoParcial> resultado3 = controlador.comprasPagoParcial();
            for (ComprasPagoParcial comprasPagoParcial:resultado3){
                System.out.print(comprasPagoParcial.getID_Proyecto()+" ");
                System.out.println(comprasPagoParcial.getFecha());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
}
}