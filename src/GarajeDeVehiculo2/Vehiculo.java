/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarajeDeVehiculo2;

/**
 *
 * @author admin
 */
public class Vehiculo {
    private String marca;
    private double precio;
    private int cilindrada;
    private double impuestoCirculacion;
    private double cuotaMesGaraje;
    private String matricula;

    // Constructor
    public Vehiculo(String marca, double precio, int cilindrada) {
        this.marca = marca;
        this.precio = precio;
        this.cilindrada = cilindrada;
        this.impuestoCirculacion = precio * 0.05; // Impuesto base por ejemplo (5% del precio)
        this.cuotaMesGaraje = 100;  // Cuota base para el garaje, este valor puede variar dependiendo del tipo
    }

    // Métodos getters
    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    public String getMatricula() {
        return matricula;
    }

    // Métodos setters
    public void setImpuestoCirculacion(double impuestoCirculacion) {
        this.impuestoCirculacion = impuestoCirculacion;
    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        this.cuotaMesGaraje = cuotaMesGaraje;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método para matricular el vehículo (validación sencilla)
    public boolean matricular(String matricula) {
        if (matricula.length() == 6) {
            setMatricula(matricula);
            return true;
        }
        return false;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", precio=" + precio + ", cilindrada=" + cilindrada + ", impuestoCirculacion=" + impuestoCirculacion + ", cuotaMesGaraje=" + cuotaMesGaraje + "]";
    }
}
