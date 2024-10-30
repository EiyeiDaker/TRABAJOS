/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alfombrass;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        // Crear objetos de las clases hijas
        AlfombraRedonda alfombraRedonda = new AlfombraRedonda("Rojo", 20, 5);
        AlfombraCuadrada alfombraCuadrada = new AlfombraCuadrada("Azul", 25, 4);

        // Calcular y mostrar la superficie y el precio de la alfombra redonda
        System.out.println("Alfombra Redonda:");
        System.out.println("Color: " + alfombraRedonda.getColor());
        System.out.println("Superficie: " + alfombraRedonda.calcularSuperficie() + " m²");
        System.out.println("Precio: " + alfombraRedonda.calcularPrecio() + " €\n");

        // Calcular y mostrar la superficie y el precio de la alfombra cuadrada
        System.out.println("Alfombra Cuadrada:");
        System.out.println("Color: " + alfombraCuadrada.getColor());
        System.out.println("Superficie: " + alfombraCuadrada.calcularSuperficie() + " m²");
        System.out.println("Precio: " + alfombraCuadrada.calcularPrecio() + " €");
    }
}
