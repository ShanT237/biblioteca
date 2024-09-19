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

    public void mostrarCatalogo(){
        System.out.println("Catalogo ");
        for (Libro i : libros) {
            System.out.println(i);
            
        } System.out.println("");
    }
    public boolean verificarLibro(Libro libro) {
        boolean sentinel = false;
        for (Libro i : libros) {
            if (i.getCodigo().equals(libro.getCodigo())) {
                sentinel = true;
                break;

            }

        }
        return sentinel;

    }

    public void agregarLibro(Libro libro) {
        if (verificarLibro(libro)) {
            System.out.println("No se puede agregar libro porque ya existe");
            System.out.println("");
        } else {
            libros.add(libro);
            System.out.println("El libro fue registrado exitosamente");
            System.out.println("");
        }

    }

    public void consultatDatosLibroString(String codigo) {

        for (Libro i : libros) {
            if (i.getCodigo().equals(codigo)) {
                System.out.println(i);
                return;
            }

        }
        System.out.println("No se pudo encontrar el libro");

    }

    public void cantidadPrestamosLibro(String titulo) {
        int contador = 0;
        for (Prestamo i : prestamos) {
            for (DetallePrestamo j : i.getDetalles()) {
                if (j.getLibro().getTitulo().equals(titulo)) {
                    contador += 1;

                }

            }

        }
        System.out.println("La cantidad de prestamos del libro " + titulo + " es " + contador);

    }

    public void remplazarLibro(String codigo) {

    }

    /*
     * Metodos Estudiante
     */
    public boolean verificarEstudiante(Estudiante estudiante) {
        boolean sentinel = false;
        for (Estudiante i : estudiantes) {
            if (i.getCedula().equals(estudiante.getCedula())) {
                sentinel = true;
                break;

            }

        }
        return sentinel;

    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (verificarEstudiante(estudiante)) {
            System.out.println("No se puede agregar el estudiante porque ya existe");
        } else {
            estudiantes.add(estudiante);
            System.out.println("El estudiante fue registrado exitosamente");
        }

    }

    /*
     * Metodos Prestamo
     */

     public boolean verificarPrestamo(Prestamo prestamo) {
        boolean sentinel = false;
        for (Prestamo i : prestamos) {
            if (i.getCodigo() == prestamo.getCodigo()) {
                sentinel = true;
                break;

            }

        }
        return sentinel;

    }

    public void agregarPrestamo(Prestamo prestamo) {
        if (verificarPrestamo(prestamo)) {
            System.out.println("No se puede agregar el prestamo porque ya existe");
        } else {
            prestamos.add(prestamo);
            System.out.println("El prestamo fue registrado exitosamente");
        }

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
