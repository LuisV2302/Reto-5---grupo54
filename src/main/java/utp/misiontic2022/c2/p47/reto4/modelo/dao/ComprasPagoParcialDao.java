package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.ComprasPagoParcial;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class ComprasPagoParcialDao {

    Connection conexion3;

    public ComprasPagoParcialDao(){
        try {
            conexion3 = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<ComprasPagoParcial> comprasPagoParcial() throws SQLException {
        ArrayList<ComprasPagoParcial> lista3 = new ArrayList<>();
        String sql = "select ID_Proyecto, strftime('%Y',Fecha) from Compra c  where Pagado = 'Parcialmente' and strftime('%m', Fecha) = '02'";
        Statement pstm = conexion3.createStatement();
        ResultSet resultados3 = pstm.executeQuery(sql);
        while(resultados3.next()){
            ComprasPagoParcial comprasPagoParcial = new ComprasPagoParcial();
            comprasPagoParcial.setID_Proyecto(resultados3.getInt(1));
            comprasPagoParcial.setFecha(resultados3.getString(2));
            lista3.add(comprasPagoParcial);
        }
        return lista3;
    }
}