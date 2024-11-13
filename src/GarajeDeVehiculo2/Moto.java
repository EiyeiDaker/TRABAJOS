/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarajeDeVehiculo2;

/**
 *
 * @author admin
 */
public class Moto extends Vehiculo {
    
    private boolean tieneSidecar;

    public Moto(String marca, int precio, int cilindrada,  boolean tieneSidecar) {
        super(marca, precio, cilindrada);
        this.tieneSidecar = tieneSidecar;
        if (tieneSidecar){
            setCuotaMesGaraje(getCuotaMesGaraje() * 1.5);
            calcularImpuestoCirculacion();
        }
    }

    
    public void calcularImpuestoCirculacion() {
        double impuestoBase = getPrecio() * 0.02;
        if (tieneSidecar){
        impuestoBase *= 1.1;
        }
        setImpuestoCirculacion(impuestoBase);
  }    
}
