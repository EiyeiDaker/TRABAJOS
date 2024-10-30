/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculosInventado;

/**
 *Crea un sistema que permita gestionar diferentes tipos de vehículos utilizando herencia. Las clases que deberás implementar son:

Clase Vehículo:

Atributos:
String marca
String modelo
int año
double precio
Métodos:
Constructor para inicializar todos los atributos.
Método double calcularImpuesto() que devuelve un porcentaje del precio según el año (5% para vehículos nuevos, 2% para vehículos de 5 a 10 años, y 1% para vehículos de más de 10 años).
Clase Coche (hereda de Vehículo):

Atributos:
int puertas
Métodos:
Constructor que incluya el número de puertas.
Override del método calcularImpuesto() para añadir un 1% extra si tiene más de 4 puertas.
Clase Motocicleta (hereda de Vehículo):

Atributos:
boolean tieneSidecar
Métodos:
Constructor que incluya si tiene sidecar o no.
Override del método calcularImpuesto() para añadir un 0.5% si tiene sidecar.
Clase Principal:

Crea instancias de Coche y Motocicleta y muestra el impuesto calculado para cada uno.
 * @author admin
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }
    
    
    public double calcularImpuesto() {
    
        int edad = 2024 - anio;
        
        if (edad < 5){
        return precio * 0.05;
       
        }else if (edad <= 10) {
        return precio * 0.02;
        
        }else {
        return precio * 0.01;
        }    
    
    }    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
    
}
