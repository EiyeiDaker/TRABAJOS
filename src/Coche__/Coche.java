/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coche__;

/**
 *
 * @author admin
 */
// Clase Coche
public class Coche {
    private final String marca; // No se puede modificar
    private String color; // Se puede modificar
    private int km; // Inicialmente vale 0
    double precio; // Se puede modificar
    private final double factorContaminacion; // No se puede modificar
    private final int anio; // No se puede modificar
    private String matricula; // Se puede asignar una vez
    private String dniTitular; // Se puede modificar

    // Constructor
    public Coche(String marca, String color, double precio, double factorContaminacion, int anio) {
        this.marca = marca;
        this.color = color;
        this.km = 0; // Inicialmente vale 0
        this.precio = precio;
        this.factorContaminacion = factorContaminacion;
        this.anio = anio;
        this.matricula = null; // Inicialmente sin matrícula
        this.dniTitular = null; // Inicialmente sin titular
    }

    // Métodos de acceso
    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void incrementarKm(int km) {
        if (km > 0) {
            this.km += km;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getFactorContaminacion() {
        return factorContaminacion;
    }

    public int getAnio() {
        return anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (this.matricula == null) {
            this.matricula = matricula;
        } else {
            System.out.println("La matrícula no se puede cambiar.");
        }
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    // Método para comprar coche
    public void comprarCoche(Coche otroCoche) {
        if (this.dniTitular != null && otroCoche.dniTitular != null) {
            this.dniTitular = otroCoche.dniTitular;
        } else {
            System.out.println("Ambos coches deben tener un DNI de titular para realizar la compra.");
        }
    }
}

