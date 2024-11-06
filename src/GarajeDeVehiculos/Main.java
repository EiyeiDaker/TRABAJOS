/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarajeDeVehiculos;
import java.util.Scanner;

/**
 *
 * @author Edgar Jesid Velez Castellanos 20241222443
 */




public class Main {
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenú de gestión del Garaje:");
            System.out.println("1. Alquilar un espacio");
            System.out.println("2. Retirar vehículo");
            System.out.println("3. Consulta de ingresos mensuales");
            System.out.println("4. Consulta proporción autos / motos");
            System.out.println("5. Listado de matrículas y cuota mensual y tipo vehículo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Opción para alquilar espacio
                    System.out.print("Ingrese el tipo de vehículo (1 para Auto, 2 para Moto): ");
                    int tipoVehiculo = scanner.nextInt();
                    scanner.nextLine();  // Consumir el salto de línea

                    System.out.print("Ingrese la marca del vehículo: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el precio del vehículo: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese la cilindrada del vehículo: ");
                    int cilindrada = scanner.nextInt();

                    Vehiculo vehiculo;
                    if (tipoVehiculo == 1) {
                        // Crear Auto
                        System.out.print("¿Tiene radio? (true/false): ");
                        boolean tieneRadio = scanner.nextBoolean();
                        System.out.print("¿Tiene navegador? (true/false): ");
                        boolean tieneNavegador = scanner.nextBoolean();

                        vehiculo = new Auto(marca, precio, cilindrada, tieneRadio, tieneNavegador);
                    } else {
                        // Crear Moto
                        System.out.print("¿Tiene sidecar? (true/false): ");
                        boolean tieneSidecar = scanner.nextBoolean();

                        vehiculo = new Moto(marca, cilindrada, (int) precio, tieneSidecar);
                    }

                    scanner.nextLine(); // Consumir salto de línea
                    System.out.print("Ingrese la matrícula (6 caracteres): ");
                    String matricula = scanner.nextLine();

                    if (vehiculo.matricular(matricula)) {
                        if (garaje.alquilarEspacio(vehiculo)) {
                            System.out.println("Vehículo alquilado correctamente.");
                        } else {
                            System.out.println("No se pudo alquilar el vehículo. Verifique las restricciones del garaje.");
                        }
                    } else {
                        System.out.println("Matrícula inválida. Debe tener 6 caracteres.");
                    }
                    break;

                case 2:
                    // Opción para retirar vehículo
                    System.out.print("Ingrese la matrícula del vehículo a retirar: ");
                    scanner.nextLine();
                    String matriculaRetiro = scanner.nextLine();
                    if (garaje.retirarVehiculo(matriculaRetiro)) {
                        System.out.println("Vehículo retirado exitosamente.");
                    } else {
                        System.out.println("No se encontró el vehículo con la matrícula proporcionada.");
                    }
                    break;

                case 3:
                    // Consultar ingresos mensuales
                    System.out.println("Ingresos mensuales del garaje: $" + garaje.calcularIngresos());
                    break;

                case 4:
                    // Consultar proporción de autos y motos
                    int numAutos = garaje.calcularOcupacionPorTipoVehiculo(new Auto("", 0, 0, false, false));
                    int numMotos = garaje.calcularOcupacionPorTipoVehiculo(new Moto("", 0, 0, false));
                    System.out.println("Cantidad de Autos: " + numAutos);
                    System.out.println("Cantidad de Motos: " + numMotos);
                    if (numMotos + numAutos > 0) {
                        double proporcionAutosMotos = (double) numAutos / (numMotos + numAutos);
                        System.out.println("Proporción Autos/Motos: " + proporcionAutosMotos);
                    } else {
                        System.out.println("No hay vehículos en el garaje.");
                    }
                    break;

                case 5:
                    // Listado de matrículas, cuotas y tipo de vehículo
                    System.out.println("Listado de vehículos en el garaje:");
                    for (Vehiculo v : garaje.getVehiculos()) {
                        String tipo = v instanceof Auto ? "Auto" : "Moto";
                        System.out.println("Matrícula: " + v.getMatricula() + ", Tipo: " + tipo + ", Cuota mensual: $" + v.getCuotaMesGaraje());
                    }
                    break;

                case 6:
                    // Salir
                    continuar = false;
                    System.out.println("Saliendo del sistema de gestión del garaje...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
