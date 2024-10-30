/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvaEmpresa;

/**
 *
 * @author admin
 */
// Clase Prueba
// Clase Prueba
public class Prueba {
    public static void main(String[] args) {
        // Crear productos frescos
        ProductoFresco productoFresco1 = new ProductoFresco("2024-12-01", "Lote001", "2023-06-15", "España");
        ProductoFresco productoFresco2 = new ProductoFresco("2024-11-30", "Lote002", "2023-07-20", "Italia");

        // Crear productos refrigerados
        ProductoRefrigerado productoRefrigerado1 = new ProductoRefrigerado("2025-01-15", "Lote003",
                "ORG123", "2023-08-10", 4.0, "Francia");
        ProductoRefrigerado productoRefrigerado2 = new ProductoRefrigerado("2025-02-20", "Lote004",
                "ORG456", "2023-09-05", 2.0, "Alemania");
        ProductoRefrigerado productoRefrigerado3 = new ProductoRefrigerado("2025-03-25", "Lote005",
                "ORG789", "2023-09-15", 3.5, "Portugal");

        // Crear productos congelados
        ProductoCongelado productoCongelado1 = new ProductoCongeladoPorAgua("2025-05-30", "Lote006",
                "2023-10-01", "Suecia", -18, 5);
        ProductoCongelado productoCongelado2 = new ProductoCongeladoPorAgua("2025-06-15", "Lote007",
                "2023-10-10", "Finlandia", -20, 6);
        ProductoCongelado productoCongelado3 = new ProductoCongeladoPorAire("2025-07-01", "Lote008",
                "2023-10-15", "Noruega", -15, 78, 21, 0.04, 0.12);
        ProductoCongelado productoCongelado4 = new ProductoCongeladoPorAire("2025-08-20", "Lote009",
                "2023-10-20", "Dinamarca", -18, 80, 19, 0.05, 0.10);
        ProductoCongelado productoCongelado5 = new ProductoCongeladoPorNitrogeno("2025-09-30", "Lote010",
                "2023-10-25", "Islandia", -25, "Inmersión", 120);

        // Mostrar la información de cada producto
        productoFresco1.mostrarInformacion();
        System.out.println();
        productoFresco2.mostrarInformacion();
        System.out.println();
        productoRefrigerado1.mostrarInformacion();
        System.out.println();
        productoRefrigerado2.mostrarInformacion();
        System.out.println();
        productoRefrigerado3.mostrarInformacion();
        System.out.println();
        productoCongelado1.mostrarInformacion();
        System.out.println();
        productoCongelado2.mostrarInformacion();
        System.out.println();
        productoCongelado3.mostrarInformacion();
        System.out.println();
        productoCongelado4.mostrarInformacion();
        System.out.println();
        productoCongelado5.mostrarInformacion();
    }
}
