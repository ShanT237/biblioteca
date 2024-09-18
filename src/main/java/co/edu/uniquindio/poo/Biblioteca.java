package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private LinkedList<Estudiante> estudiantes;
    private LinkedList<Prestamo> prestamos;
    private LinkedList<Libro> libros;
    private LinkedList<Bibliotecario> bibliotecarios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        estudiantes = new LinkedList<>();
        prestamos = new LinkedList<>();
        libros = new LinkedList<>();
        bibliotecarios = new LinkedList<>();
    }

    /*
     * Metodos principales
     */

     /*
      * Metodos libro
      */
    public String consultatDatosLibroString(String codigo) {
        String texto = "";

        return texto;

    }

    public void cantidadPrestamosLibro(String nombre){

    }
    public void remplazarLibro(String coidgo){

    }







    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public LinkedList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(LinkedList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }
    
    public LinkedList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(LinkedList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }


    

    @Override
    public String toString() {
        return "Biblioteca: nombre " + nombre + ", estudiantes " + estudiantes + ", prestamos " + prestamos
                + ", libros " + libros + ".";
    }


    

}
