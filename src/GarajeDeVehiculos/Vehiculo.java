/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarajeDeVehiculos;

/**
 *
 * @author Edgar Jesid Velez Castellanos 20241222443
 */
public class Vehiculo {
    
    private String matricula;
    private String marca;
    double precio;
    private int cilindrada;
    private double impuestoCirculacion;
    private double cuotaMesGaraje;

   
    public static final int CONSTANTE =100;
    
   public Vehiculo(String marca, double precio, int cilindrada) {
        this.matricula=null;
        this.marca = marca;
        this.precio = precio;
        this.cilindrada = cilindrada;
        this.cuotaMesGaraje=CONSTANTE;
        calcularImpuestoCirculacion();
    }

    public String getMatricula() {
        return matricula;
    }

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

    public void setImpuestoCirculacion(double impuestoCirculacion) {
        this.impuestoCirculacion = impuestoCirculacion;
    }
    
    

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if(cuotaMesGaraje>=0){
        
        this.cuotaMesGaraje = cuotaMesGaraje;
        }
    }

    public void calcularImpuestoCirculacion(){
    this.impuestoCirculacion = this.precio * 0.02;
    }

  public boolean matricular(String matricula) {
    if (matricula.length() == 6) {
        this.matricula = matricula;
        return true;
    } else {
        System.out.println("La matrícula debe tener exactamente 6 caracteres.");
        return false;
    }
}


}
    
    

