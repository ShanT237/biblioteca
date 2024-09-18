package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Prestamo {
    private double costo;
    private LocalDate fechaprestamo;
    private LocalDate fechaentrega;
    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(double costo, LocalDate fechaprestamo, LocalDate fechaentrega, Estudiante estudiante, Libro libro) {
        this.costo = costo;
        this.fechaprestamo = fechaprestamo;
        this.fechaentrega = fechaentrega;
        this.estudiante = estudiante;
        this.libro = libro;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
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

    public void setFechaentrega(LocalDate fechaentraga) {
        this.fechaentrega = fechaentraga;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "Prestamo: costo " + costo + ", fechaprestamo " + fechaprestamo + ", fechaentrega " + fechaentrega
                + ", estudiante " + estudiante + ", libro " + libro + ".";
    }

    

    

    
    
}
