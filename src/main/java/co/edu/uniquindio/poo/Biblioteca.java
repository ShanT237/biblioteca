package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Biblioteca {

    private String nombre;
    private LinkedList<Estudiante> estudiantes;
    private LinkedList<Bibliotecario> bibliotecarios;
    private LinkedList<Prestamo> prestamos;
    private LinkedList<Libro> libros;
    private double ganancia;
    private int cantidadLibros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.ganancia = 0;
        this.cantidadLibros = 0;
        estudiantes = new LinkedList<>();
        bibliotecarios = new LinkedList<>();
        prestamos = new LinkedList<>();
        libros = new LinkedList<>();
    }

    /*
     * Metodos Principales
     */

    /*
     * Reportes
     */

    public void totalLiquidacionBibliotecario() {
        double total = 0;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            total += calcularPagoBibliotecario(bibliotecario);

        }
        System.out.println("El total a pagar a los bibliotecario es de:");
        System.out.println(total);
    }

    public double calcularPagoBibliotecario(Bibliotecario bibliotecario) {
        double totalComision = 0;
        for (Prestamo prestamo : bibliotecario.getPrestamos()) {
            double costoPrestamo = prestamo.calcularCosto();
            totalComision += costoPrestamo * 0.20;

        }
        double bonificacion = 1 + (bibliotecario.getAntiguedad() * 0.02);
        double totalPago = totalComision * bonificacion;

        return totalPago;

    }

    public void estudianteConMasPrestamos() {
        Estudiante estudianteMax = null;
        int maxPrestamos = 0;

        for (Estudiante estudiante : estudiantes) {
            int contador = 0;

            if (estudiante.getPrestamos() != null) {
                contador = estudiante.getPrestamos().size();
            }

            if (contador > maxPrestamos) {
                maxPrestamos = contador;
                estudianteMax = estudiante;
            }
            if (estudianteMax != null) {
                System.out.println("El estudiante con más préstamos es:");
                System.out.println(estudianteMax);
            } else {
                System.out.println("No hay estudiantes con préstamos.");
            }
        }
    }

    public void TotalGanancia() {
        System.out.println("La biblioteca tiene una ganancia de:");
        System.out.println(ganancia);
    }

    /*
     * Metodos Libro
     */
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

    public Libro buscarLibro(String codigo) {
        for (Libro i : libros) {
            if (i.getCodigo().equals(codigo)) {
                System.out.println("Datos del libro:");
                System.out.println(i);
                System.out.println("");
                return i;
            }
        }
        System.out.println("");
        System.out.println("No se pudo encontrar el libro");
        System.out.println("");
        return null;

    }

    public void cantidadPrestamosLibro(String titulo) {
        int contador = 0;
        for (Prestamo i : prestamos) {
            for (DetallePrestamo j : i.getDetallePrestamos()) {
                if (j.getLibro().getTitulo().equals(titulo)) {
                    contador++;

                }

            }

        }

        if (contador <= 0) {
            System.out.println("El libro no tiene prestamos");

        } else {
            System.out.println("La cantidad de prestamos del libro ".concat(titulo).concat(" es de ") + contador);
        }

    }

    public void modficarLibro(String codigo, Libro libro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCodigo().equals(codigo)) {
                if (libros.get(i).isEstadoPrestamos()) {
                    System.out.println("No se puede modificar el libro porque se encuentra activo en prestamos");
                    return;

                } else {
                    libros.set(i, libro);
                    System.out.println("El libro fue modificado de manera exitosa");
                    return;
                }
            }

        }
        System.out.println("El libro no se pudo encontrar");

    }

    public void mostrarCatalogo() {
        System.out.println("Catalogo ");
        for (Libro i : libros) {
            System.out.println(i);

        }
        System.out.println("");
    }

    /*
     * Metodos Prestamo
     */

    public void ConsultarDatosPrestamo(String codigo) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                System.out.println("Información del prestamo " + codigo);
                System.out.println(prestamo);
                return;
            }
        }
        System.out.println("No se pudo encontrar el prestamo");
    }

    public void registrarPrestamo(Prestamo prestamo) {
        if (verificarPrestamo(prestamo.getCodigo())) {
            System.out.println("No se puede agregar registrar el prestamo porque ya existe un prestamo con el mismo codigo");

        } else{
            prestamos.add(prestamo);
            prestamo.getBibliotecario().getPrestamos().add(prestamo);
            prestamo.getEstudiante().getPrestamos().add(prestamo);
            System.out.printf("El prestamo fue registrado de forma exitosa");
            ganancia += prestamo.calcularCosto();
        }

    }

    public boolean verificarPrestamo(String codigo) {
        boolean valor = false;
        for (Prestamo prestamo : prestamos) {
            if(prestamo.getCodigo().equals(codigo)){
                valor = true;
                break;

            }

        } return valor;

    }

    /*
     * Metodos Bibliotecario
     */
    public void cantidadPrestamosBibliotecarios() {
        System.out.println("Cantidad de prestamos realizados por los empleados");
        for (Bibliotecario bibliotecario : bibliotecarios) {
            int contador = 0;
            for (Prestamo prestamo : bibliotecario.getPrestamos()) {
                contador++;
                System.out.println(
                        "Bibliotecario: " + bibliotecario.getNombre() + " - Cantidad de préstamos: " + contador);
            }
        }
    }

    public boolean verificarBibliotecario(Bibliotecario bibliotecario) {
        boolean sentinel = false;
        for (Bibliotecario i : bibliotecarios) {
            if (i.getCedula().equals(bibliotecario.getCedula())) {
                sentinel = true;
                break;

            }

        }
        return sentinel;

    }

    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        if (verificarBibliotecario(bibliotecario)) {
            System.out.println("No se puede agregar el bibliotecario porque ya existe");
        } else {
            bibliotecarios.add(bibliotecario);
            System.out.println("El bibliotecario fue registrado exitosamente");
        }

    }

    /*
     * Metodos Estudiantes
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

    public LinkedList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(LinkedList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
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

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    @Override
    public String toString() {
        return "Biblioteca: Nombre " + nombre + ", Estudiantes " + estudiantes + ", Bliotecarios " + bibliotecarios
                + ", Prestamos " + prestamos + ", Libros " + libros + ", Ganancia " + ganancia + ", cantidadLibros "
                + cantidadLibros + ".";
    }

}