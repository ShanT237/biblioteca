package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

/*
 * Clase Prestamo, este cuenta con fecha de prestamo y fecha entraga, un costo por dia, codigo, estudiante, bibliotecario y una lista de detalles prestamo
 */
public class Prestamo {

    private LocalDate fechaPrestamo, fechaEntrega;
    private double costoDia;
    private String codigo;
    private Estudiante estudiante;
    private Bibliotecario bibliotecario;
    private LinkedList<DetallePrestamo> detallePrestamos;

    /*
     * Metodo constructor
     */
    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaEntrega, double costoDia, String codigo,
            Estudiante estudiante, Bibliotecario bibliotecario) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.costoDia = costoDia;
        this.codigo = codigo;
        this.estudiante = estudiante;
        this.bibliotecario = bibliotecario;
        detallePrestamos = new LinkedList<>();
    }

    /*
     * Se agrega detallePrestamo a la lista de detallesPrestamo
     * 
     * @param recibe detalles prestamo para agregar a la lista
     */
    public void agregarDetallePrestamo(DetallePrestamo detalles) {
        int nuevaCantidad = detalles.getLibro().getUnidadesDisponibles() - detalles.getCantidad();
        if (nuevaCantidad < 0) {
            System.out.println(
                    "No se puede llevar a cabo la operación porque la cantidad de libros pedidos excede la disponible");
            return;
        } else {
            if (nuevaCantidad == 0) {
                detalles.getLibro().setEstado(Estado.AGOTADO);

            }
            detalles.getLibro().setUnidadesDisponibles(nuevaCantidad);
            detalles.getLibro().setEstadoPrestamos(true);
            detallePrestamos.add(detalles);
            System.out.println("Su pedido fue añadido de forma exitosa");
        }
    }

    /*
     * Metodo para entragar el prestamo con su costo
     * Se hace uso del metodo calcularCosto
     */
    public void entregarPrestamo() {
        System.out.println("El costo total de su prestamo es de:");
        System.out.println(calcularCosto());
    }

    /*
     * El metodo opera la cantidad de dias, el costo por dia y los subtotales
     */
    public double calcularCosto() {
        int dias = calcularDias();
        double subTotales = calcularSubtotales();
        return dias * costoDia * subTotales;

    }

    /*
     * Metodo para calcular los dias
     */
    public int calcularDias() {
        int dias = 0;
        LocalDate fechaInicio = fechaPrestamo;
        while (fechaInicio.isBefore(fechaEntrega)) {

            fechaInicio = fechaInicio.plusDays(1);
            dias++;
        }
        return dias;
    }

    /*
     * Metodo para calcular sub totales
     */
    public double calcularSubtotales() {
        double totalSubTotales = 0;
        for (DetallePrestamo i : detallePrestamos) {
            totalSubTotales += i.getSubTotal();

        }
        return totalSubTotales;
    }
    /*
     * Metodos Get, Set y ToString
     */

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getCostoDia() {
        return costoDia;
    }

    public void setCostoDia(double costoDia) {
        this.costoDia = costoDia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public LinkedList<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }

    public void setDetallePrestamos(LinkedList<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    @Override
    public String toString() {
        return "Prestamo: fechaPrestamo " + fechaPrestamo + ", fechaEntrega " + fechaEntrega + ", costoDia " + costoDia
                + ", codigo " + codigo + ", estudiante " + estudiante + ", bibliotecario " + bibliotecario
                + ", detallePrestamos " + detallePrestamos + ".";
    }

}