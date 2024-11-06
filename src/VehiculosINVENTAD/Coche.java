/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculosINVENTAD;

/**
 *
 * @author admin
 */
public class Coche extends Vehiculo{
    
    private int numPuertas;
    private boolean esAutomatico;

    public Coche(int numPuertas, boolean esAutomatico, String tipo, int numRuedas, double velocidadMaxima, String color) {
        super(tipo, numRuedas, velocidadMaxima, color);
        this.numPuertas = numPuertas;
        this.esAutomatico = esAutomatico;
    }

    @Override
    public String describirVehiculo() {
     this.numPuertas = numPuertas;
     this.esAutomatico = esAutomatico;
        return null;
    }
    
    
    public String tipoTransmision(){
    
     if (esAutomatico && true) 
            System.out.println("EL coche es automatico");
     
     else {System.out.println("EL coche es manual");
     
     }
        return null;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public boolean isEsAutomatico() {
        return esAutomatico;
    }

    public void setEsAutomatico(boolean esAutomatico) {
        this.esAutomatico = esAutomatico;
    }
    
    
    
    
}
