package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.MaterialesConstruccion;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class MaterialesConstruccionDao {
    Connection conexion2;

    public MaterialesConstruccionDao(){
        try {
            conexion2 = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<MaterialesConstruccion> materialesConstruccion() throws SQLException {
        ArrayList<MaterialesConstruccion> lista2 = new ArrayList<>();
        String sql = "select ID_Compra, mc.Nombre_Material from Compra c join MaterialConstruccion mc on c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion and mc.Precio_Unidad < 1100";
        Statement pstm = conexion2.createStatement();
        ResultSet resultados2 = pstm.executeQuery(sql);
        while(resultados2.next()){
            MaterialesConstruccion materialesConstruccion = new MaterialesConstruccion();
            materialesConstruccion.setID_Compra(resultados2.getInt(1));
            materialesConstruccion.setNombreMaterial(resultados2.getString(2));
            lista2.add(materialesConstruccion);
        }
        return lista2;
    }
}