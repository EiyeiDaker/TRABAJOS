/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cochess;

/**
 *
 * @author admin
 */
// Clase Prueba para probar las clases
public class Prueba {
    public static void main(String[] args) {
        // Crear un coche
        Coche coche1 = new Coche("Toyota", "Rojo", 15000, 0.1, 2015);
        coche1.setDniTitular("12345678A");
        coche1.setMatricula("XYZ-1234");

        // Crear un coche matriculado
        CocheMatriculado cocheMatriculado = new CocheMatriculado("Honda", "Azul", 20000, 0.2, 2010,
                "ABC-5678", "87654321B", 2011, 5);

        // Probar los métodos
        System.out.println(coche1);
        System.out.println(cocheMatriculado);

        // Incrementar kilómetros
        coche1.incrementarKm(100);
        System.out.println("Kilómetros después de incrementar: " + coche1.getKm());

        // Comprar coche
        cocheMatriculado.comprarCoche(coche1);
        System.out.println("DNI Titular después de compra: " + cocheMatriculado.getDniTitular());

        // Mostrar impuestos
        System.out.println("Impuesto de matriculación: " + cocheMatriculado.getImpuestoMatriculacion());
    }
}

