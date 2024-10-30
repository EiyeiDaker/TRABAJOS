/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioHerenci;

/**
 *
 * @author admin
 */
public class Cuadrado extends Forma {
    
    private double lado;

    public Cuadrado(float lado, String nombre, double posicionX, double posicionY, String color) {
        super(nombre, posicionX, posicionY, color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
    public double calcularPerimetro(){
    return 4 * lado;
       }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
  
    
}
