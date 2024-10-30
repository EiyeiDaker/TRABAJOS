/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculosInventado;

/**
 *
 * @author admin
 */
public class Coche extends Vehiculo {
    
    private int puertas;

    public Coche(int puertas, String marca, String modelo, int anio, double precio) {
        super(marca, modelo, anio, precio);
        this.puertas = puertas;
    }

    @Override
    public double calcularImpuesto() {
        double impuesto = super.calcularImpuesto(); 
        if (puertas > 4){
        impuesto += this.getPrecio()* 0.01;
        }
        
        return impuesto;
    }

   
    
}
