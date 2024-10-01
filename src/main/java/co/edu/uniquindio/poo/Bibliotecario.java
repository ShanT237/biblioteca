package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Bibliotecario extends Persona {

    /*
     * Bibliotecario tiene un salario, antiguedad y una lista de prestamos al cual
     * esta asociado, ademas extiende de la clase persona
     */
    private double salario;
    private int antiguedad;
    private LinkedList<Prestamo> prestamos;

    /*
     * Metodo constructor
     */
    public Bibliotecario(String nombre, String cedula, String correo, int telefono, double salario, int antiguedad) {
        super(nombre, cedula, correo, telefono);
        this.salario = salario;
        this.antiguedad = antiguedad;
        prestamos = new LinkedList<>();
    }
    /*
     * Metodos Get, Set y Tostring
     */

    @Override
    public String toString() {
        return "Bibliotecario: Salario " + salario + ", Antiguedad " + antiguedad + ".";
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public LinkedList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(LinkedList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

}