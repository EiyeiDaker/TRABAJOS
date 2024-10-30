/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentasDeAhorros;

/**
 *
 * @author admin
 */
public class Cuenta {
    private long numeroCueta;
    private double saldo;
    private Persona cliente;

    public Cuenta(long numeroCueta, Persona cliente) {
        this.numeroCueta = numeroCueta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public long getNumeroCueta() {
        return numeroCueta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getCliente() {
        return cliente;
    }
    
    public void ingresar (double x){
    if (x>0){
    saldo+= x;
    } 
    else {System.out.println("El monto a ingresar debe ser mayor a 0");
    }
    }
    
    public void retirar (double x){
    if (x>0 && x<=saldo){
    saldo -= x;
    }
    else {
        System.out.println("El valor a retirar es invalido");
    }
    
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCueta=" + numeroCueta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }

    boolean retirar(double x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
}
