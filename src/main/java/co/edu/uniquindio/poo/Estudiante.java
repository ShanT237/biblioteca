package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

/*
 * Estudiante hereda de la clase abstracta Persona. Como atributos propios tienen edad y lista de prestamos
 */
public class Estudiante extends Persona {

    private int edad;
    private LinkedList<Prestamo> prestamos;

    /*
     * Metodo Constructor
     */
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
        return "Estudiante: edad " + edad + ", nombre" + getNombre() + ", cedula " + getCedula()
                + ", correo " + getCorreo() + ", telefono " + getTelefono() + ".";
    }

}