/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculosINVENTAD;

/**
 *
 * @author admin
 */
public class Vehiculo {
    
    private String tipo;
    private int numRuedas;
    private double velocidadMaxima;
    private String color;

    public Vehiculo(String tipo, int numRuedas, double velocidadMaxima, String color) {
        this.tipo = tipo;
        this.numRuedas = numRuedas;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    public String describirVehiculo(){
     this.tipo = tipo;
     this.numRuedas = numRuedas;
     this.velocidadMaxima = velocidadMaxima;
     this.color = color;
        return null;
    }
    
}
