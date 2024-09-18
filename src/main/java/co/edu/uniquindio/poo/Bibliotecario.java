package co.edu.uniquindio.poo;

public class Bibliotecario {
    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;
    private double salario;
    private int antiguedad;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario, int antiguedad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.salario = salario;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    @Override
    public String toString() {
        return "Bibliotecario: nombre " + nombre + ", cedula " + cedula + ", telefono " + telefono + ", correo "
                + correo + ", salario " + salario + ", antiguedad " + antiguedad + ".";
    }

    

    

    

    
    
}
