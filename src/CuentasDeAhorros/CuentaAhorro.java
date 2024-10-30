/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentasDeAhorros;

/**
 *
 * @author admin
 */
public class CuentaAhorro extends Cuenta {
    
    private double saldoMinimo;

    public CuentaAhorro(double saldoMinimo, long numeroCueta, Persona cliente) {
        super(numeroCueta, cliente);
        this.saldoMinimo = saldoMinimo;
    }

   

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "saldoMinimo=" + saldoMinimo + '}';
    }

    @Override
    public void retirar(double x) {
    if (x>0 && (this.getSaldo() - x) >= saldoMinimo ){
        super.retirar(x);
    } else {System.out.println("El retiro no puede causar que el saldo baje del saldo mínimo");
    }
    
   }
    
}