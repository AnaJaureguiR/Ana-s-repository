
import java.util.Optional;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Ana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        GestorDeEmpleados gestor = new GestorDeEmpleados();

        Empleado emp1 = new Empleado(1, "ANA JAUREGUI", "DESARROLLADOR", 1500);
        Empleado emp2 = new Empleado(2, "ANDREA GONZALEZ", "TESTER", 1600);
        Empleado emp3 = new Empleado(3, "MIGUEL PALOMAS", "INGENIERO", 2100);

        gestor.añadirEmpleado(emp1);
        gestor.añadirEmpleado(emp2);
        gestor.añadirEmpleado(emp3);

        System.out.println("Todos los empleados:");
        gestor.empleados.forEach(System.out::println);

        System.out.println("\nBuscando empleado con ID 2:");
        Optional<Empleado> empleado = gestor.buscarEmpleado(2);
        empleado.ifPresent(System.out::println);

        System.out.println("\nEliminando empleado con ID 1:");
        boolean eliminado = gestor.eliminarEmpleado(1);
        System.out.println("Empleado eliminado: " + eliminado);

        System.out.println("\nTodos los empleados después de eliminar:");
        gestor.empleados.forEach(System.out::println);

    }
}
