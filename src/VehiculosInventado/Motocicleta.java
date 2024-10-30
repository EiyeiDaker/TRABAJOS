/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculosInventado;

/**
 *
 * @author admin
 */
public class Motocicleta extends Vehiculo{
    
    private boolean tieneSidecar;

    public Motocicleta(boolean tieneSidecar, String marca, String modelo, int anio, double precio) {
        super(marca, modelo, anio, precio);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public double calcularImpuesto() {
        double impuesto= calcularImpuesto();   
        
        if (tieneSidecar) {
            
         impuesto += this.getPrecio() * 0.005;
        }
    return impuesto;
    }

   
    
    
}
