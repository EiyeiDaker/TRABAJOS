/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuanDesguace;

/**
 *
 * @author admin
 */
// Clase Coche
public class Coche extends Vehiculo {
    private int numeroPuertas; // Número de puertas

    // Constructor
    public Coche(double precioCompra, String marca, int numeroPuertas) {
        super(precioCompra, marca);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double precioVenta() {
        return precioCompra * 1.6; // Precio de venta inicial (60% más)
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}

