/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeEmpleadosInventado;

/**
 *
 * @author admin
 */
// Clase principal para probar el sistema
public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("Juan", "E001", 3000, 10);
        EmpleadoMedioTiempo empleado2 = new EmpleadoMedioTiempo("Ana", "E002", 1500);

        System.out.println("Bonificación de " + empleado1.getNombre() + ": " + empleado1.calcularBonificacion());
        System.out.println("Bonificación de " + empleado2.getNombre() + ": " + empleado2.calcularBonificacion());
    }
}

