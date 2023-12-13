package Ejercicio2;

public class Deposito {
    private int CantidadMax;
    private int Cantidad;
    private Contenido contenido;

    public Deposito(int cantidadMax, int cantidad) {
        CantidadMax = cantidadMax;
        Cantidad = cantidad;
    }

    public Deposito(int cantidadMax, int cantidad, Contenido contenido) {
        CantidadMax = cantidadMax;
        Cantidad = cantidad;
        this.contenido = contenido;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public int getCantidadMax() {
        return CantidadMax;
    }

    public void setCantidadMax(int cantidadMax) {
        CantidadMax = cantidadMax;
    }

    public void estaVacio(){
        setCantidad(0);
    }

    @Override
    public String toString() {
        return "Deposito de" + contenido + "( "+getCantidad() + getCantidadMax() +" )";
    }

}
