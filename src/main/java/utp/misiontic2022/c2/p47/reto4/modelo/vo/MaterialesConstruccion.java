package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class MaterialesConstruccion {
    private  int ID_Compra;
    private  String NombreMaterial;
    private  int Precio_Unidad;

    public MaterialesConstruccion(){

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
