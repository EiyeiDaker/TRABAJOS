/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuanDesguace;

/**
 *
 * @author admin
 */
// Clase Prueba
public class Prueba {
    public static void main(String[] args) {
        // Crear un array de 3 camiones
        Camion[] camiones = new Camion[3];
        camiones[0] = new Camion(30000, "Volvo", 20.5, 4);
        camiones[1] = new Camion(25000, "Scania", 18.0, 6);
        camiones[2] = new Camion(28000, "Mercedes", 25.0, 5);

        // Mostrar el precio de venta de todos los camiones
        System.out.println("Precio de venta de los camiones:");
        for (Camion camion : camiones) {
            System.out.println("Camión " + camion.getMarca() + ": " + camion.precioVenta() + "€");
        }

        // Crear un array de 2 furgonetas
        Furgoneta[] furgonetas = new Furgoneta[2];
        furgonetas[0] = new Furgoneta(20000, "Renault", 15.0);
        furgonetas[1] = new Furgoneta(22000, "Peugeot", 8.0);

        // Mostrar el precio de venta de todas las furgonetas
        System.out.println("\nPrecio de venta de las furgonetas:");
        for (Furgoneta furgoneta : furgonetas) {
            System.out.println("Furgoneta " + furgoneta.getMarca() + ": " + furgoneta.precioVenta() + "€");
        }
    }
}

