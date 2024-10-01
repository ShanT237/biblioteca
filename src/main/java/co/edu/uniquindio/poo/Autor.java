package co.edu.uniquindio.poo;

/*
 * Representa a un autor que hereda Atributos de la clase Persona
 */
public class Autor extends Persona {
    private String fechaNacimiento;
    private String nacionalidad;

    /*
     * Metodo Constructor
     */
    public Autor(String nombre, String cedula, String correo, int telefono, String fechaNacimiento,
            String nacionalidad) {
        super(nombre, cedula, correo, telefono);
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    /*
     * Metodos Gets, Sets y ToString
     */

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
        return "Autor: fechaNacimiento " + fechaNacimiento + ", nacionalidad " + nacionalidad + ".";
    }

}
