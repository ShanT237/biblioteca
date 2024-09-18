package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Libro {
    private String codigo;
    private String isbn;
    private String autor;
    private LocalDate fecha;
    private String titulo;
    private String editorial;
    private int unidadesDisponibles;
    private Enum<Estado> estado;

    public Libro(String codigo, String isbn, String autor, LocalDate fecha, String titulo, String editorial) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.fecha = fecha;
        this.titulo = titulo;
        this.editorial = editorial;
    
    }
    /*
     * Metodos principales
     */
    public String consultatDatosLibroString(String codigo){
        String texto = "";

        return texto;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public Enum<Estado> getEstado() {
        return estado;
    }

    public void setEstado(Enum<Estado> estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Libro: codigo " + codigo + ", isbn " + isbn + ", autor " + autor + ", fecha " + fecha + ", titulo "
                + titulo + ", editorial " + editorial + ", unidadesDisponibles " + unidadesDisponibles + ", estado "
                + estado + ".";
    }

    
    
    
}
