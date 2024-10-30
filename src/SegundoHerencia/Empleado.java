/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoHerencia;

/**
 *
 * @author admin
 */
public class Empleado {
    
    private String nombre;
    private String DNI;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado(String nombre, String DNI, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.DNI = DNI;
        setEdad(edad);
        this.casado = casado;
        this.salario = salario;
    }

    public Empleado() {
    }

    public void setEdad(int edad) {
        if (edad < 18 || edad > 45) {
            throw new IllegalArgumentException("La edad debe estar entre 18 y 45 años");
        }
        this.edad = edad;
    }
    
    
    public String clasifica() {
        if (edad <= 21) {
            return "Principiante";
        } else if (edad >= 22 && edad <= 35) {
            return "Intermedio";
        } else {
            return "Senior";
        }
    }


    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", \nDNI=" + DNI + ", \nedad=" + edad + ", \ncasado=" + casado + ", \nsalario=" + salario + '}';
    }

    public void subirSalario(int porcentaje){
    salario += salario * porcentaje / 100;
    }

    public double getSalario() {
        return salario;
    }

    
   
}
