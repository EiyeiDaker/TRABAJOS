/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multiviviendas;
import java.util.ArrayList;
/**
 *
 * @author admin
 */


public class Principal {
    public static void main(String[] args) {
        // Crear una lista para almacenar las viviendas
        ArrayList<Vivienda> viviendas = new ArrayList<>();

        // Crear objetos de las clases
        Piso piso1 = new Piso("Calle Falsa 123", 80, 3, 5);
        Adosado adosado1 = new Adosado("Calle Verde 456", 120, 2);
        Chalet chalet1 = new Chalet("Calle del Sol 789", 150, 10, true);

        // Agregar viviendas a la lista
        viviendas.add(piso1);
        viviendas.add(adosado1);
        viviendas.add(chalet1);

        // Mostrar información de las viviendas
        for (Vivienda vivienda : viviendas) {
            System.out.println(vivienda);
        }
    }
}
