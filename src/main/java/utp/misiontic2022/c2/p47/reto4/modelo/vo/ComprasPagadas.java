package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class ComprasPagadas {
    private  int ID_Compra;
    private  String Pagado;
    private  String Proveedor;

    public ComprasPagadas(){

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
