package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class ComprasPagoParcial {
    private  int ID_Proyecto;
    private  String Pagado;
    private  String Fecha;

    public ComprasPagoParcial(){

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
