/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentasDeAhorros;

/**
 *
 * @author admin
 */
public class Prueba {
     public static void main(String[] args) {
        // Crear personas
        Persona persona1 = new Persona("Juan Pérez", "12345678A");
        Persona persona2 = new Persona("Ana Gómez", "87654321B");

        // Crear cuentas
        CuentaCorriente cuentaCorriente = new CuentaCorriente(persona1, 1234567890123L, 500);
        CuentaAhorro cuentaAhorro = new CuentaAhorro(persona2, 9876543210123L, 200);

        // Probar métodos de ingreso y retiro
        cuentaCorriente.ingresar(1000);
        System.out.println(cuentaCorriente);
        
        cuentaCorriente.retirar(300);
        System.out.println(cuentaCorriente);
        
        cuentaCorriente.retirar(600); // Debería mostrar mensaje de error

        cuentaAhorro.ingresar(500);
        System.out.println(cuentaAhorro);
        
        cuentaAhorro.retirar(250);
        System.out.println(cuentaAhorro);
        
        cuentaAhorro.retirar(400); // Debería mostrar mensaje de error
    }
}
    

