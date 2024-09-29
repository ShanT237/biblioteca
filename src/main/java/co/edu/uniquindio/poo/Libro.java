package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Libro {

    private String codigo, isbn, editorial, titulo;
    private Autor autor;
    private LocalDate fechaPublicacion;
    private Enum<Estado> estado;
    private boolean estadoPrestamos;
    private int unidadesDisponibles;

    public Libro(String codigo, String isbn, Autor autor, String editorial, String titulo, LocalDate fechaPublicacion,
            int unidadesDisponibles) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.estado = Estado.DISPONIBLE;
        this.estadoPrestamos = false;
        this.unidadesDisponibles = unidadesDisponibles;
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
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

    public boolean isEstadoPrestamos() {
        return estadoPrestamos;
    }

    public void setEstadoPrestamos(boolean estadoPrestamos) {
        this.estadoPrestamos = estadoPrestamos;
    }

    @Override
    public String toString() {
        return "Libro: Codigo " + codigo + ", ISBN" + isbn + ", Autor " + autor + ", Editorial " + editorial
                + ", Titulo " + titulo + ", Fecha de Publicacion " + fechaPublicacion + ", Estado " + estado
                + ", Unidades Disponibles " + unidadesDisponibles + ".";
    }

}
