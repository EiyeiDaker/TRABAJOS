/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoHerencia;

/**
 *
 * @author admin
 */
public class Programador extends Empleado{
    
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, String nombre, String DNI, int edad, boolean casado, double salario) {
        super(nombre, DNI, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    

    public Programador(String luis_fernando, String string, int par, boolean par1, int par2, int par3, String java) {
    }
    
    public double calculaSalario(){
    return lineasDeCodigoPorHora * 10;
    }

    @Override
    public String toString() {
        return super.toString() + "\nlineasDeCodigoPorHora: " + lineasDeCodigoPorHora + " \nlenguajeDominante: " + lenguajeDominante;
    }
    
    
    
}
