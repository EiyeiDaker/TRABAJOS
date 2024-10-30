/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioHerenci;

/**
 *
 * @author admin
 */
public class Triangulo extends Forma {
    
    private double base;
    private double altura;

    public Triangulo(float base, float altura, String nombre, double posicionX, double posicionY, String color) {
        super(nombre, posicionX, posicionY, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base*altura) / 2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    

    
    
    
    
    
    
  
}
