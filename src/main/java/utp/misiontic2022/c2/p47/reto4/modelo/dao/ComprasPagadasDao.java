package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.ComprasPagadas;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class ComprasPagadasDao {

    Connection conexion;

    public ComprasPagadasDao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<ComprasPagadas> comprasPagadas() throws SQLException {
        ArrayList<ComprasPagadas> lista = new ArrayList<>();
        String sql = "select ID_Compra from Compra where Pagado='No' and Proveedor = 'JUMBO'";
        Statement pstm = conexion.createStatement();
        ResultSet resultados = pstm.executeQuery(sql);
        while(resultados.next()){
            ComprasPagadas comprasPagadas = new ComprasPagadas();
            comprasPagadas.setID_Compra(resultados.getInt(1));
            lista.add(comprasPagadas);
        }
        return lista;
    }
}