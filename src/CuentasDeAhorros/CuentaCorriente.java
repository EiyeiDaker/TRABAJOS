/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentasDeAhorros;

/**
 *
 * @author admin
 */
public class CuentaCorriente extends Cuenta {
    private double maximoRetirable;

    public CuentaCorriente(double maximoRetirable) {
        this.maximoRetirable = maximoRetirable;
    }

    public double getMaximoRetirable() {
        return maximoRetirable;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "maximoRetirable=" + maximoRetirable + '}';
    }
    
    
    
}
