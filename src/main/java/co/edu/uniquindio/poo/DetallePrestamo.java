package co.edu.uniquindio.poo;

public class DetallePrestamo {
    private Libro libro;
    private int cantidad;
    private int coste;

    public DetallePrestamo(Libro libro, int cantidad) {
        this.libro = libro;
        this.cantidad = cantidad;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public void determinar(){}

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetallePrestamo: libro " + libro + ", cantidad " + cantidad + ".";
    }
    

    

    
    
}
