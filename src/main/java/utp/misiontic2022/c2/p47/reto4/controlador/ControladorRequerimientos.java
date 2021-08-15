package utp.misiontic2022.c2.p47.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.dao.ComprasPagadasDao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.ComprasPagoParcialDao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.MaterialesConstruccionDao;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.ComprasPagadas;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.MaterialesConstruccion;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.ComprasPagoParcial;

public class ControladorRequerimientos {
    
    ComprasPagadasDao dao = new ComprasPagadasDao();
    MaterialesConstruccionDao dao2 = new MaterialesConstruccionDao();
    ComprasPagoParcialDao dao3 = new ComprasPagoParcialDao();
    
    public ArrayList<ComprasPagadas> comprasPagadas() throws SQLException {
        return dao.comprasPagadas();
    }

    public ArrayList<MaterialesConstruccion> materialesConstruccion() throws SQLException {
        return dao2.materialesConstruccion();
    }

    public ArrayList<ComprasPagoParcial> comprasPagoParcial() throws SQLException {
        return dao3.comprasPagoParcial();
    }
}
