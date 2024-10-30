/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alfombra;

/**
 *
 * @author admin
 */
public class AlfombraRedonda extends Alfombra {
    private int radio;

    // Constructor
    public AlfombraRedonda(String color, int precioMetro, int radio) {
        super(color, precioMetro);
        this.radio = radio;
    }

    // Implementación de métodos de la interfaz
    @Override
    public double calcularSuperficie() {
        return Math.PI * radio * radio; // Superficie de un círculo
    }

    @Override
    public double calcularPrecio() {
        return calcularSuperficie() * getPrecioMetro(); // Precio total
    }

    // Getters y Setters
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
