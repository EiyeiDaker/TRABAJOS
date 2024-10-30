/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multiviviendas;

/**
 *
 * @author admin
 */
public class Vivienda {
    protected String calle;
    protected double precio;
    protected int superficieEnMetros;

    // Constructor
    public Vivienda(String calle, int superficieEnMetros) {
        this.calle = calle;
        this.superficieEnMetros = superficieEnMetros;
        this.precio = calcularPrecio(); // Calcular el precio al crear la vivienda
    }

    // Método para calcular el precio
    public double calcularPrecio() {
        return superficieEnMetros * 1000; // Precio base para viviendas
    }

    // Getters
    public String getCalle() {
        return calle;
    }

    public double getPrecio() {
        return precio;
    }

    public int getSuperficieEnMetros() {
        return superficieEnMetros;
    }

    @Override
    public String toString() {
        return "Vivienda en " + calle + ", Superficie: " + superficieEnMetros + "m², Precio: " + precio;
    }
}
