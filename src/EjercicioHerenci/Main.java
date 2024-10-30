/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioHerenci;

/**
 *
 * @author admin
 */
// Clase principal para probar las clases
public class Main {
    public static void main(String[] args) {
        // Crear un Triangulo
        Triangulo c1 = new Triangulo("Triángulo 1", 0, 0, "Rojo", 5, 10);
        System.out.println("Área del " + c1.getNombre() + ": " + c1.calcularArea());

        // Crear un Cuadrado
        Cuadrado c1 = new Cuadrado("Cuadrado 1", 0, 0, "Azul", 4);
        System.out.println("Área del " + c1.getNombre() + ": " + c1.calcularArea());
        System.out.println("Perímetro del " + c1.getNombre() + ": " + c1.calcularPerimetro());
    }
}
