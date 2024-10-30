/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alfombra;

/**
 *
 * @author admin
 */
public class AlfombraCuadrada extends Alfombra {
    private int lado;

    // Constructor
    public AlfombraCuadrada(String color, int precioMetro, int lado) {
        super(color, precioMetro);
        this.lado = lado;
    }

    // Implementación de métodos de la interfaz
    @Override
    public double calcularSuperficie() {
        return lado * lado; // Superficie de un cuadrado
    }

    @Override
    public double calcularPrecio() {
        return calcularSuperficie() * getPrecioMetro(); // Precio total
    }

    // Getters y Setters
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}

