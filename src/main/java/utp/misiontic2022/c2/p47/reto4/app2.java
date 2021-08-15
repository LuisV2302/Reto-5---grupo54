package utp.misiontic2022.c2.p47.reto4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class app2 {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();
    public static void main( String[] args ){
        System.out.println("Requerimiento 1");
        VistaRequerimientosReto4.requerimiento1();

        System.out.println("\nRequerimiento 2");
        VistaRequerimientosReto4.requerimiento2();

        System.out.println("\nRequerimiento 3");
        VistaRequerimientosReto4.requerimiento3();

    }
}

class JDBCUtilities {
    private static final String DATABASE_LOCATION = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}


class VistaRequerimientosReto4 {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        System.out.println("Conocer el id de las compras que si estén pagadas");
        System.out.println("ID_Compra");
        try {
            ArrayList<Requerimiento1> resultado = controlador.requerimiento1();
            for (Requerimiento1 requerimiento1:resultado){
                System.out.print(requerimiento1.getID_Compra()+ "\n");

            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        System.out.println("Conocer el id de todas las compras cuyo precio por unidad de su material de construcción sea inferior a 1100");
        System.out.println("ID_Compra");
        try {
            ArrayList<Requerimiento2> resultado2 = controlador.requerimiento2();
            for (Requerimiento2 requerimiento2:resultado2){
                System.out.print(requerimiento2.getID_Compra() + "\n");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        System.out.println("Obtener el id de la compra y el año de las compras pagadas parcialmente y en el mes '02'");
        System.out.println("Id_Proyecto fecha");
        try {
            ArrayList<Requerimiento3> resultado3 = controlador.requerimiento3();
            for (Requerimiento3 requerimiento3:resultado3){
                System.out.print(requerimiento3.getID_Proyecto()+" ");
                System.out.println(requerimiento3.getFecha());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
}
}

class ControladorRequerimientos {
    
    Requerimiento1Dao dao = new Requerimiento1Dao();
    Requerimiento2Dao dao2 = new Requerimiento2Dao();
    Requerimiento3Dao dao3 = new Requerimiento3Dao();
    
    public ArrayList<Requerimiento1> requerimiento1() throws SQLException {
        return dao.requerimiento1();
    }

    public ArrayList<Requerimiento2> requerimiento2() throws SQLException {
        return dao2.requerimiento2();
    }

    public ArrayList<Requerimiento3> requerimiento3() throws SQLException {
        return dao3.requerimiento3();
    }
}

class Requerimiento1 {
    private  int ID_Compra;
    private  String Pagado;
    private  String Proveedor;

    public Requerimiento1(){

    }

    public int getID_Compra() {
        return ID_Compra;
    }

    public void setID_Compra(int iD_Compra) {
        ID_Compra = iD_Compra;
    }

    public  String getPagado() {
        return Pagado;
    }
    public void setPagado(String pagado) {
        Pagado = pagado;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String proveedor) {
        Proveedor = proveedor;
    } 
}

class Requerimiento2 {
    private  int ID_Compra;
    private  String NombreMaterial;
    private  int Precio_Unidad;

    public Requerimiento2(){

    }

    public int getID_Compra() {
        return ID_Compra;
    }

    public void setID_Compra(int iD_Compra) {
        ID_Compra = iD_Compra;
    }

    public  String getNombreMaterial() {
        return NombreMaterial;
    }
    public void setNombreMaterial(String nombreMaterial) {
        NombreMaterial = nombreMaterial;
    }

    public int getPrecio_Unidad() {
        return Precio_Unidad;
    }

    public void setPrecio_Unidad(int precio_Unidad) {
        Precio_Unidad = precio_Unidad;
    }
}

class Requerimiento3 {
    private  int ID_Proyecto;
    private  String Pagado;
    private  String Fecha;

    public Requerimiento3(){

    }

    public int getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(int iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }

    public  String getPagado() {
        return Pagado;
    }
    public void setPagado(String pagado) {
        Pagado = pagado;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }
}

class Requerimiento1Dao {

    Connection conexion;

    public Requerimiento1Dao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<Requerimiento1> requerimiento1() throws SQLException {
        ArrayList<Requerimiento1> lista = new ArrayList<>();
        String sql = "select ID_Compra from Compra where Pagado='No' and Proveedor = 'JUMBO'";
        Statement pstm = conexion.createStatement();
        ResultSet resultados = pstm.executeQuery(sql);
        while(resultados.next()){
            Requerimiento1 requerimiento1 = new Requerimiento1();
            requerimiento1.setID_Compra(resultados.getInt(1));
            lista.add(requerimiento1);
        }
        return lista;
    }
}

class Requerimiento2Dao {
    Connection conexion2;

    public Requerimiento2Dao(){
        try {
            conexion2 = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<Requerimiento2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento2> lista2 = new ArrayList<>();
        String sql = "select ID_Compra from Compra c join MaterialConstruccion mc on c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion and mc.Precio_Unidad < 1100";
        Statement pstm = conexion2.createStatement();
        ResultSet resultados2 = pstm.executeQuery(sql);
        while(resultados2.next()){
            Requerimiento2 requerimiento2 = new Requerimiento2();
            requerimiento2.setID_Compra(resultados2.getInt(1));
            lista2.add(requerimiento2);
        }
        return lista2;
    }
}

class Requerimiento3Dao {

    private static final String prueba = "select ID_Proyecto, strftime('%Y',Fecha) from Compra c  where Pagado = 'Parcialmente' and strftime('%m', Fecha) = '02'";
    Connection conexion3;

    public Requerimiento3Dao(){
        try {
            conexion3 = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<Requerimiento3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento3> lista3 = new ArrayList<>();
        String sql = prueba;
        Statement pstm = conexion3.createStatement();
        ResultSet resultados3 = pstm.executeQuery(sql);
        while(resultados3.next()){
            Requerimiento3 requerimiento3 = new Requerimiento3();
            requerimiento3.setID_Proyecto(resultados3.getInt(1));
            requerimiento3.setFecha(resultados3.getString(2));
            lista3.add(requerimiento3);
        }
        return lista3;
    }
}

