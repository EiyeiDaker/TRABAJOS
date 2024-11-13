/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarajeDeVehiculo2;

/**
 *
 * @author admin
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear el garaje con un número de espacios
        Garaje garaje = new Garaje(10);

        // Crear un escáner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar menú
            System.out.println("\n--- Menú Garaje ---");
            System.out.println("1. Alquilar un espacio");
            System.out.println("2. Buscar un vehículo por matrícula");
            System.out.println("3. Calcular la proporción de Autos/Motos/Camiones");
            System.out.println("4. Ver camiones en el garaje por tipo");
            System.out.println("5. Ver cantidad de plazas disponibles");
            System.out.println("6. Ver ingresos del garaje");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de entrada
            
            switch (opcion) {
                case 1: // Alquilar un espacio
                    System.out.print("Ingrese matrícula del vehículo: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Ingrese tipo de vehículo (auto/moto/camion): ");
                    String tipoVehiculo = scanner.nextLine();

                    // Crear el vehículo correspondiente
                    Vehiculo vehiculo = null;
                    if (tipoVehiculo.equalsIgnoreCase("auto")) {
                        System.out.print("Ingrese marca: ");
                        String marcaAuto = scanner.nextLine();
                        System.out.print("Ingrese precio: ");
                        double precioAuto = scanner.nextDouble();
                        System.out.print("Ingrese cilindrada: ");
                        int cilindradaAuto = scanner.nextInt();
                        scanner.nextLine();  // Limpiar buffer
                        System.out.print("¿Tiene radio (true/false)? ");
                        boolean tieneRadio = scanner.nextBoolean();
                        System.out.print("¿Tiene navegador (true/false)? ");
                        boolean tieneNavegador = scanner.nextBoolean();
                        scanner.nextLine();  // Limpiar buffer
                        vehiculo = new Auto(marcaAuto, precioAuto, cilindradaAuto, tieneRadio, tieneNavegador);
                    } else if (tipoVehiculo.equalsIgnoreCase("moto")) {
                        System.out.print("Ingrese marca: ");
                        String marcaMoto = scanner.nextLine();
                        System.out.print("Ingrese precio: ");
                        double precioMoto = scanner.nextDouble();
                        System.out.print("Ingrese cilindrada: ");
                        int cilindradaMoto = scanner.nextInt();
                        scanner.nextLine();  // Limpiar buffer
                        System.out.print("¿Tiene sidecar (true/false)? ");
                        boolean tieneSidecar = scanner.nextBoolean();
                        scanner.nextLine();  // Limpiar buffer
                        vehiculo = new Moto(marcaMoto, (int) precioMoto, cilindradaMoto, tieneSidecar);
                    } else if (tipoVehiculo.equalsIgnoreCase("camion")) {
                        System.out.print("Ingrese marca: ");
                        String marcaCamion = scanner.nextLine();
                        System.out.print("Ingrese precio: ");
                        double precioCamion = scanner.nextDouble();
                        System.out.print("Ingrese cilindrada: ");
                        int cilindradaCamion = scanner.nextInt();
                        System.out.print("Ingrese número de ejes: ");
                        int numeroEjes = scanner.nextInt();
                        scanner.nextLine();  // Limpiar buffer
                        System.out.print("Ingrese tipo de camión (sencillo/doble): ");
                        String tipoCamion = scanner.nextLine();
                        System.out.print("Ingrese capacidad de carga (en toneladas): ");
                        double capacidadCarga = scanner.nextDouble();
                        scanner.nextLine();  // Limpiar buffer
                        vehiculo = new Camion(numeroEjes, tipoCamion, capacidadCarga, marcaCamion, precioCamion, cilindradaCamion);
                    } else {
                        System.out.println("Tipo de vehículo no válido.");
                        break;
                    }

                    // Establecer matrícula
                    if (vehiculo != null) {
                        vehiculo.setMatricula(matricula);
                        // Alquilar el vehículo en el garaje
                        if (garaje.alquilarEspacio(vehiculo)) {
                            System.out.println("Vehículo alquilado con éxito.");
                        }
                    }
                    break;
                    
                case 2: // Buscar un vehículo por matrícula
                    System.out.print("Ingrese matrícula a buscar: ");
                    String matriculaBuscar = scanner.nextLine();
                    int posicion = garaje.buscarVehiculoPorMatricula(matriculaBuscar);
                    if (posicion != -1) {
                        System.out.println("Vehículo encontrado en la posición: " + posicion);
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;
                    
                case 3: // Calcular proporción de autos/motos/camiones
                    garaje.calcularProporcionVehiculos();
                    break;
                    
                case 4: // Ver camiones en el garaje por tipo
                    System.out.println("Número de camiones sencillos: " + garaje.contarCamionesPorTipo("sencillo"));
                    System.out.println("Número de camiones dobles: " + garaje.contarCamionesPorTipo("doble"));
                    break;
                    
                case 5: // Ver cantidad de plazas disponibles
                    System.out.println("Plazas disponibles: " + garaje.plazasDisponibles());
                    break;
                    
                case 6: // Ver ingresos del garaje
                    System.out.println("Ingresos del garaje: $" + garaje.calcularIngresos());
                    break;
                    
                case 7: // Salir
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
