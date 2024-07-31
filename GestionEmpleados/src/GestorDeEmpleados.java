
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ana
 */
public class GestorDeEmpleados {

    List<Empleado> empleados;
    private static final String FILE_NAME = "empleados.txt";
    
     public GestorDeEmpleados() {
        empleados = new ArrayList<>();
        cargarEmpleados();
    }

    public void añadirEmpleado(Empleado empleado) {
        empleados.add(empleado);
        guardarEmpleados();
    }

    public boolean eliminarEmpleado(int ID) {
        boolean removed = empleados.removeIf(empleado -> empleado.getID() == ID);
          if (removed) {
            guardarEmpleados();
        }
        return removed;
    }


    public Optional<Empleado> buscarEmpleado (int ID) {
        return empleados.stream()
                .filter(empleado -> empleado.getID() == ID)
                .findFirst();
    }

   
    private void guardarEmpleados() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Empleado empleado : empleados) {
                writer.write(empleado.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error guardando los empleados: " + e.getMessage());
        }
    }

    private void cargarEmpleados() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                empleados.add(Empleado.fromString(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException e) {
            System.err.println("Error cargando los empleados: " + e.getMessage());
        }
    }

 

}
