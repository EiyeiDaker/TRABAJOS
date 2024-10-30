/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;
import java.util.Scanner;
/**
 *
 * @author admin
 */


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[4]; // Crear un array para 4 empleados

        // Leer datos de los empleados
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Ingrese el nombre del empleado " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el teléfono del empleado " + (i + 1) + ":");
            String telefono = scanner.nextLine();
            empleados[i] = new Empleado(nombre, telefono); // Crear instancia de Empleado
        }

        // Mostrar datos de cada empleado
        System.out.println("\nDatos de los empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        // Mostrar el número de empleados instanciados
        System.out.println("\nNúmero total de empleados: " + Empleado.getNumeroEmpleados());

        scanner.close(); // Cerrar el scanner
    }
}
