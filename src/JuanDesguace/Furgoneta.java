/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuanDesguace;

/**
 *
 * @author admin
 */
// Clase Furgoneta
public class Furgoneta extends Vehiculo {
    private double capacidadCarga; // Capacidad de carga en metros cúbicos

    // Constructor
    public Furgoneta(double precioCompra, String marca, double capacidadCarga) {
        super(precioCompra, marca);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double precioVenta() {
        double precioBase = precioCompra * 1.6; // Precio de venta inicial
        if (capacidadCarga > 10) {
            precioBase *= 1.2; // 20% adicional si la capacidad de carga es mayor de 10 m³
        }
        return precioBase;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}

