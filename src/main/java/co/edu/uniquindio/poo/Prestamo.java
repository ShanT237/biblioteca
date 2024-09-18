package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Prestamo {
    private double costo;
    private int codigo;
    private LocalDate fechaprestamo;
    private LocalDate fechaentrega;
    private Estudiante estudiante;
    private List<DetallePrestamo> detalles;

    public Prestamo(double costo, int codigo, LocalDate fechaprestamo, LocalDate fechaentrega, Estudiante estudiante, Libro libro) {
        this.costo = 0;
        this.codigo = codigo;
        this.fechaprestamo = fechaprestamo;
        this.fechaentrega = fechaentrega;
        this.estudiante = estudiante;
        this.detalles = new LinkedList<>();
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaprestamo() {
        return fechaprestamo;
    }

    public void setFechaprestamo(LocalDate fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }

    public LocalDate getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(LocalDate fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<DetallePrestamo> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePrestamo> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Prestamo: costo " + costo + ", codigo " + codigo + ", fechaprestamo " + fechaprestamo
                + ", fechaentrega " + fechaentrega + ", estudiante " + estudiante + ", detalles " + detalles + ".";
    }


    

    
    
    

    

    
    
}
