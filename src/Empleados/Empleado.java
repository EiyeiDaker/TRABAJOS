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

public class Empleado {
    // Atributos privados
    private String nombre;
    private String telefono;
    private static int numeroEmpleados = 0; // Atributo estático

    // Constructor
    public Empleado(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        numeroEmpleados++; // Incrementar el contador de empleados
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para obtener el número de empleados
    public static int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    // Método para mostrar los datos del empleado
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + telefono;
    }
}

