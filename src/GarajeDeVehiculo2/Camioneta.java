/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarajeDeVehiculo2;

/**
 *
 * @author admin
 */
public class Camioneta extends Vehiculo {
    private String tipoServicio;  // SUV, Pickup, Carga, Otro
    private int numeroPasajeros;  // Número de pasajeros
    private boolean tieneRemolque;  // Si tiene remolque

    // Constructor
    public Camioneta(String tipoServicio, int numeroPasajeros, boolean tieneRemolque, String marca, double precio, int cilindrada) {
        super(marca, precio, cilindrada);
        
        // Validación de número de pasajeros según tipo de servicio
        if ("Pickup".equalsIgnoreCase(tipoServicio) || "Carga".equalsIgnoreCase(tipoServicio)) {
            if (numeroPasajeros != 2) {
                throw new IllegalArgumentException("Las camionetas Pickup y Carga solo pueden tener 2 pasajeros.");
            }
        } else if (numeroPasajeros > 5) {
            throw new IllegalArgumentException("El número máximo de pasajeros para las camionetas SUV y Otro es 5.");
        }

        this.tipoServicio = tipoServicio;
        this.numeroPasajeros = numeroPasajeros;
        this.tieneRemolque = tieneRemolque;

        // Ajustar impuesto de circulación y cuota mensual del garaje
        calcularImpuestoCirculacion();
        ajustarCuotaMesGaraje();
    }

    

    // Método para calcular el impuesto de circulación
    public void calcularImpuestoCirculacion() {
        double impuestoBase = getPrecio() * 0.05;  // Impuesto base del 5% sobre el precio
        setImpuestoCirculacion(impuestoBase);
    }

    // Método para ajustar la cuota mensual del garaje
    private void ajustarCuotaMesGaraje() {
        double cuota = getCuotaMesGaraje();

        // Aumento según el tipo de servicio
        if ("Pickup".equalsIgnoreCase(tipoServicio) || "Carga".equalsIgnoreCase(tipoServicio) || "Otro".equalsIgnoreCase(tipoServicio)) {
            cuota *= 1.45;  // Aumento del 45% para Pickup, Carga, Otro
        } else if ("SUV".equalsIgnoreCase(tipoServicio)) {
            cuota *= 1.10;  // Aumento del 10% para SUV
        }

        // Aumento según el número de pasajeros
        if (numeroPasajeros == 2) {
            cuota *= 1.50;  // Aumento del 50% si tiene 2 pasajeros
        } else {
            cuota *= 1.60;  // Aumento del 60% si tiene más de 2 pasajeros
        }

        // Aumento adicional si tiene remolque
        if (tieneRemolque) {
            cuota *= 1.10;  // Aumento del 10% si tiene remolque
        }

        setCuotaMesGaraje(cuota);
    }

    // Métodos getters
    public String getTipoServicio() {
        return tipoServicio;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public boolean isTieneRemolque() {
        return tieneRemolque;
    }

    // Override del método toString
    @Override
    public String toString() {
        return "Camioneta [marca=" + getMarca() + ", precio=" + getPrecio() + ", cilindrada=" + getCilindrada() 
                + ", tipoServicio=" + tipoServicio + ", numeroPasajeros=" + numeroPasajeros 
                + ", tieneRemolque=" + tieneRemolque + ", impuestoCirculacion=" + getImpuestoCirculacion()
                + ", cuotaMesGaraje=" + getCuotaMesGaraje() + "]";
    }
}
