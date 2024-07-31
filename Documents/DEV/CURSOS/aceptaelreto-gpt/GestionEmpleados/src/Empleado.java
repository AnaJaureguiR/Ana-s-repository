/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ana
 */
public class Empleado {

    private int ID;
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(int ID, String nombre, String puesto, double salario) {
        this.ID = ID;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    void add(Empleado empleados) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Empleado{" + "ID=" + ID + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    //para arreglar el fallo de carga sepador ,
    public String datosGuardar(){
        return ID + "," + nombre + "," + puesto + "," + salario;
    }

    public static Empleado fromString(String str) {
        String[] parts = str.split(",");
        return new Empleado(Integer.parseInt(parts[0]), parts[1], parts[2], Double.parseDouble(parts[3]));
    }

}
