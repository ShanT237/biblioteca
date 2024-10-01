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

    /*
     * Metodo constructor
     */
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
    /*
     * Calcula el total a pagar a los bibliotecarios: El metodo itera en la lista de
     * bibliotecarios y hace uso del metodo calcularPagoBibliotecario para
     * determinar el pago por individuo
     */
    public void totalPagoBibliotecarios() {
        double total = 0;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            total += calcularPagoBibliotecario(bibliotecario);

        }
        System.out.println("El total a pagar a los bibliotecario es de:");
        System.out.println(total);
    }

    /*
     * Calcula el pago por bibliotecario
     * 
     * @param el bibliotecario a calcular
     * 
     * @return el total a pagar al bibliotecario
     */
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

    /*
     * Encuentra el estudiante con más prestamos e imprime su datos
     * Se itera en la lista de estudiantes, se hace uso de dos variables para llevar
     * un seguimiento
     */
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
        }

        if (estudianteMax != null) {
            System.out.println("El estudiante con más préstamos es:");
            System.out.println(estudianteMax);
        } else {
            System.out.println("No hay estudiantes con préstamos.");
        }
    }

    /*
     * Se imprime el total de ganancias de la biblioteca
     */
    public void TotalGanancia() {
        System.out.println("La biblioteca tiene una ganancia de:");
        System.out.println(ganancia);
    }

    /*
     * Metodos Libro
     */

    /*
     * El metodo verifica que el registro del libro se repita
     * 
     * @param el libro a verificar
     * 
     * @return el
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

    /*
     * Metodo para agregar un Libro a la biblioteca
     * 
     * @param el libro a registrar
     */
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

    /*
     * Se busca un libro dado su codigo
     * 
     * @param el codigo del libro a buscar
     * 
     * @return el libro encontrado, o null si no se encuentra
     */
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

    /*
     * Itera en la lista pretamos y se compara con el titulo de libro para asi
     * contar la cantidad de prestamos en los que esta
     * 
     * @param el titulo del libro al cual se le quiere determinar la cantidad de
     * prestamos
     */
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
    /*
     * Metodo para modificar un libro comparando su codigo su codigo
     * 
     * @param se recive el libro a modificar
     */

    public void modficarLibro(Libro libro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCodigo().equals(libro.getCodigo())) {
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
    /*
     * Se muestra el catalo de libros de la biblioteca
     */

    public void mostrarCatalogo() {
        System.out.println("Catalogo ");
        for (Libro i : libros) {
            System.out.println(i);
            System.out.println("");

        }
    }

    /*
     * Metodos Prestamo
     */

    /*
     * Se consulta los datos de un prestamo dado su codigo
     * 
     * @param se recibe el codigo del prestamo a consultar
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

    /*
     * Se registra el prestamo en la lista de la biblioteca
     * 
     * @param se recibe el prestamo que se debe registrar
     */
    public void registrarPrestamo(Prestamo prestamo) {
        if (verificarPrestamo(prestamo.getCodigo())) {
            System.out.println("No se puede agregar registrar el prestamo porque ya existe un prestamo con el mismo codigo");
        } else {
            prestamos.add(prestamo);
            prestamo.getBibliotecario().getPrestamos().add(prestamo);
            prestamo.getEstudiante().getPrestamos().add(prestamo);
            ganancia += prestamo.calcularCosto();  
            System.out.println("El prestamo fue registrado de forma exitosa");
        }
    }

    /*
     * Se verica que el prestamo no se repita
     * 
     * @param codigo del prestamo a verificar
     */
    public boolean verificarPrestamo(String codigo) {
        boolean valor = false;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                valor = true;
                break;

            }

        }
        return valor;

    }

    /*
     * Metodos Bibliotecario
     */

    /*
     * Se verificar la cantidad de prestamo en total realizador por los
     * bibliotecarios
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

    /*
     * Verifica que el bibliorio no se repita usando el atributo cedulas
     * 
     * @retun se retorna verdadero o falso dependiendo la situación
     */
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

    /*
     * Metodo para agregar bibliotecario
     * 
     * @param el bibliotecario a agregar
     */
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
    /*
     * Metodo para verificar que un estudiante no se repita
     * 
     * @param estudiante
     * 
     * @return un verdadero o falso
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

    /*
     * Metodo para agregar un estudiante
     * 
     * @param el estudiante que se va agregar
     */
    public void agregarEstudiante(Estudiante estudiante) {
        if (verificarEstudiante(estudiante)) {
            System.out.println("No se puede agregar el estudiante porque ya existe");
        } else {
            estudiantes.add(estudiante);
            System.out.println("El estudiante fue registrado exitosamente");
        }

    }

    /*
     * Metodos Get, Set y Tostring
     */

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Biblioteca: nombre " + nombre + ", estudiantes " + estudiantes + ", bibliotecarios " + bibliotecarios
                + ", prestamos " + prestamos + ", libros " + libros + ", ganancia " + ganancia + ", cantidadLibros "
                + cantidadLibros + ".";
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

}