/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculosINVENTAD;

/**
 *
 * @author admin
 */
public class Moto extends Vehiculo {
    
    private boolean tieneSidecar;

    public Moto(boolean tieneSidecar, String tipo, int numRuedas, double velocidadMaxima, String color) {
        super(tipo, numRuedas, velocidadMaxima, color);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public String describirVehiculo() {
       if (tieneSidecar && true) {
           System.out.println("Tiene Sidecar");
       }
        else {
                System.out.println("No tiene Sidecar");
          }
        return null;
       
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }
    
    
    
}
