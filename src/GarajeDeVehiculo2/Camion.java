/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarajeDeVehiculo2;

/**
 *
 * @author admin
 */

public class Camion extends Vehiculo { 
    private int numeroEjes;
    private String tipoCamion; // Sencillo o Doble
    private double capacidadCarga; // En toneladas

    // Constructor
    public Camion(int numeroEjes, String tipoCamion, double capacidadCarga, String marca, double precio, int cilindrada) {
        super(marca, precio, cilindrada);

        // Validación del tipo y número de ejes
        if ("Sencillo".equalsIgnoreCase(tipoCamion) && numeroEjes != 2) {
            throw new IllegalArgumentException("Un camión sencillo solo puede tener 2 ejes.");
        } else if ("Doble".equalsIgnoreCase(tipoCamion) && (numeroEjes < 3 || numeroEjes > 6)) {
            throw new IllegalArgumentException("Un camión doble debe tener entre 3 y 6 ejes.");
        }

        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
        this.capacidadCarga = capacidadCarga;

        // Ajustar impuestos y cuota del garaje
        calcularImpuestoCirculacion();
        ajustarCuotaMesGaraje();
    }

    // Método para calcular el impuesto de circulación
    public void calcularImpuestoCirculacion() {
        double impuestoBase = getPrecio() * 0.09; // Impuesto base del 9% sobre el precio
        impuestoBase += 10 * (int)(capacidadCarga / 5); // 10 pesos por cada 5 toneladas
        setImpuestoCirculacion(impuestoBase);
    }

    // Método para ajustar la cuota mensual del garaje
    private void ajustarCuotaMesGaraje() {
        if ("Sencillo".equalsIgnoreCase(tipoCamion)) {
            setCuotaMesGaraje(getCuotaMesGaraje() * 1.75); // Aumento del 75% si es camión sencillo
        } else if ("Doble".equalsIgnoreCase(tipoCamion)) {
            setCuotaMesGaraje(getCuotaMesGaraje() * 2.25); // Aumento del 125% si es camión doble
        }
    }

    // Métodos getters
    public int getNumeroEjes() {
        return numeroEjes;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    // Override del método toString
    @Override
    public String toString() {
        return "Camion [marca=" + getMarca() + ", precio=" + getPrecio() + ", cilindrada=" + getCilindrada() 
                + ", numeroEjes=" + numeroEjes + ", tipoCamion=" + tipoCamion + ", capacidadCarga=" + capacidadCarga + "]";
    }
}

    
    
    
    
    
    