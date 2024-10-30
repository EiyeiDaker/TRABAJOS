/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuanDesguace;

/**
 *
 * @author admin
 */
// Clase base Vehiculo
public abstract class Vehiculo {
    protected double precioCompra; // Precio pagado por el vehículo
    protected String marca; // Marca del vehículo

    // Constructor
    public Vehiculo(double precioCompra, String marca) {
        this.precioCompra = precioCompra;
        this.marca = marca;
    }

    // Método abstracto para calcular el precio de venta
    public abstract double precioVenta();

    // Getters
    public double getPrecioCompra() {
        return precioCompra;
    }

    public String getMarca() {
        return marca;
    }
}
