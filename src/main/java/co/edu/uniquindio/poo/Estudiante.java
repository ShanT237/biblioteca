package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Estudiante extends Persona {

    private int edad;
    private LinkedList<Prestamo> prestamos;

    public Estudiante(String nombre, String cedula, String correo, int telefono, int edad) {
        super(nombre, cedula, correo, telefono);
        this.edad = edad;
        prestamos = new LinkedList<>();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LinkedList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(LinkedList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Estudiante: Edad " + edad + ", Prestamos=" + prestamos + ".";
    }

}