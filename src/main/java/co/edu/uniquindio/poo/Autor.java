package co.edu.uniquindio.poo;

public class Autor extends Persona {
    private String fechaNacimiento;
    private String nacionalidad;

    public Autor(String nombre, String cedula, String correo, int telefono, String fechaNacimiento,
            String nacionalidad) {
        super(nombre, cedula, correo, telefono);
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor: Fecha de Nacimiento " + fechaNacimiento + ", Nacionalidad " + nacionalidad + ".";
    }

}
