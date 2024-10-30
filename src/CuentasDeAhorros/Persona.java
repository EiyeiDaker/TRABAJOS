/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentasDeAhorros;

/**
 *
 * @author admin
 */
public class Persona {
    
    private String nombre;
    private String NIF;

    public Persona(String nombre, String NIF) {
        this.nombre = nombre;
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNIF() {
        return NIF;
    }
    
    
}
