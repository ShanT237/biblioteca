package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Prestamo {

    private LocalDate fechaPrestamo, fechaEntrega;
    private double costoDia;
    private String codigo;
    private Estudiante estudiante;
    private Bibliotecario bibliotecario;
    private LinkedList<DetallePrestamo> detallePrestamos;

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


    public void agregarLibroPrestamo(DetallePrestamo detalles){
        int nuevaCantidad = detalles.getLibro().getUnidadesDisponibles() - detalles.getCantidad();
        if(nuevaCantidad < 0){
            System.out.println("No se puede llevar a cabo la operación porque la cantidad de libros pedidos excede la disponible");
            return;
        } else{
            if(nuevaCantidad == 0){
                detalles.getLibro().setEstado(Estado.AGOTADO);

            }
            detalles.getLibro().setUnidadesDisponibles(nuevaCantidad);
            detalles.getLibro().setEstadoPrestamos(true);
            detallePrestamos.add(detalles);
            System.out.println("Su pedido fue añadido de forma exitosa");
        }
    }

    public void entregarPrestamo(){
        System.out.println("El costo total de su prestamo es de:");
        System.out.println(calcularCosto());
    }

    public double calcularCosto(){
        int dias = calcularDias();
        double subTotales = calcularSubtotales();
        return dias * costoDia * subTotales;

    }

    public int calcularDias(){
        int dias = 0;
        LocalDate fechaInicio = fechaPrestamo;
        while (fechaInicio.isBefore(fechaEntrega)) {

            fechaInicio = fechaInicio.plusDays(1);
            dias++;
        }
        return dias;
    }
    public double calcularSubtotales(){
        double totalSubTotales = 0;
        for (DetallePrestamo i : detallePrestamos) {
            totalSubTotales += i.getSubTotal();
            
            
        }
        return totalSubTotales;
    }

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
        return "Prestamo: Fecha de Prestamo " + fechaPrestamo + ", Fecha de Entrega " + fechaEntrega + ", Costo por Dia " + costoDia
                + ", Codigo " + codigo + ", Estudiante " + estudiante + ", Bibliotecario " + bibliotecario
                + ", detallePrestamos " + detallePrestamos + ".";
    }



}