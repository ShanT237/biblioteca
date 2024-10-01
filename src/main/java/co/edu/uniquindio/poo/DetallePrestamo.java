package co.edu.uniquindio.poo;

/*
 * La siguiente clase representa un descripción más detallada del libro, como la cantidad, el total y el libro
 */
public class DetallePrestamo {

    private int cantidad;
    private double subTotal;
    private Libro libro;

    /*
     * Metodo constructor DetallePrestamo
     */
    public DetallePrestamo(int cantidad, Libro libro, double subTotal) {
        this.cantidad = cantidad;
        this.libro = libro;
        this.subTotal = subTotal;
    }

    /*
     * Metodos Set, Get y Tostring
     */

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "DetallePrestamo: cantidad " + cantidad + ", subTotal " + subTotal + ", libro " + libro + ".";
    }

}