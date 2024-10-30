/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuanDesguace;

/**
 *
 * @author admin
 */
// Clase Camion
public class Camion extends Vehiculo {
    private double tamañoRemolque; // Tamaño del remolque
    private int numeroEjes; // Número de ejes

    // Constructor
    public Camion(double precioCompra, String marca, double tamañoRemolque, int numeroEjes) {
        super(precioCompra, marca);
        this.tamañoRemolque = tamañoRemolque;
        this.numeroEjes = numeroEjes;
    }

    @Override
    public double precioVenta() {
        return (precioCompra * 1.6) * numeroEjes; // Precio de venta inicial multiplicado por el número de ejes
    }

    public double getTamañoRemolque() {
        return tamañoRemolque;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }
}

