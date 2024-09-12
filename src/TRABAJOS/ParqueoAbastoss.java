/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TRABAJOS;
import java.util.Scanner;

/* Nombre: Edgar Jesid Velez Castellanos 20241222443
 */

public class ParqueoAbastoss {
    public static void main(String[] args) throws Exception {
        System.out.println("PARQUEO CAMIONES");

        Scanner sc = new Scanner(System.in);

        int cantCamiones ;


        System.out.println("ingrese la cantidad de camiones que entraron: "); //aqui solicitamos la cantidad de camniones que ingresaron ese dia
        
        cantCamiones = sc.nextInt();
        
        if (cantCamiones <= 100) {
            double[][] ingresos;

            ingresos = new double[cantCamiones][6];

            for (int i = 0; i < cantCamiones; i++) {

              
                    Scanner IngresoTipoServicio = new Scanner(System.in); // aqui pediremos el tipo del servicio
                
                    System.out.println("Ingrese el tipo de servicio:  1 - Carga   2 - Descarga " );

                    double TipoServicio = IngresoTipoServicio.nextDouble();

                    if (TipoServicio <= 2 && TipoServicio > 0){
                        ingresos[i][0] = TipoServicio;
                    } else {
                        ingresos[i][0] = 2;
                    }

              
                    Scanner IngresoTipoProducto = new Scanner(System.in);

                    System.out.println("Ingrese el tipo de Producto: 1 -  Perecedero  2 - No perecedero " ); //solicitamos el tipo del producto

                    double TipoProducto = IngresoTipoProducto.nextDouble();

                    if (TipoProducto <= 2 && TipoProducto > 0){
                    ingresos[i][1] = TipoProducto;
                    } else {
                        ingresos[i][1] = 2;
                    }

               

                    Scanner IngresoPesoProducto = new Scanner(System.in);

                    System.out.println("Ingrese el peso:  ");    //solicitamos el peso

                    double PesoProducto = IngresoPesoProducto.nextDouble();

                
                    ingresos[i][2] = PesoProducto;
              
            

                    Scanner ingresoPermanencia = new Scanner(System.in);

                    System.out.println("ingrese tiempo que permanecio el camion: " ); // solicitamos el tiempo que permanecio el camion en el parqueadero

                    double tiempopermanencia = ingresoPermanencia.nextDouble();

                  
                    ingresos[i][3] = tiempopermanencia;

                    
                    
                    Scanner largoDelCamion = new Scanner(System.in);

                    System.out.println("ingrese el largo del camion:  "); // solicitamos el largo del camion 

                    double MCamion = largoDelCamion.nextDouble();

                  
                    ingresos[i][4] = MCamion;

               

                    double ValorPagar;

                
                    if(ingresos[i][0] == 2){
                    if (ingresos[i][1] == 1){
                        if (ingresos[i][2] < 8 && ingresos[i][2] > 0) {
                            ValorPagar = 15000 * ingresos[i][2];

                            ingresos[i][5]= ValorPagar;
                        } else if (ingresos[i][2] >= 8) {
                            ValorPagar = 9000 * ingresos[i][2];

                            ingresos[i][5]= ValorPagar;
                        } else {
                            ingresos[i][5] = 1/0; 
                        }
                    } else {
                        if (ingresos[i][2] < 8 && ingresos[i][2] > 0) {
                            ValorPagar = 60000;

                            ingresos[i][5]= ValorPagar;
                        } else if (ingresos[i][2] >= 8) {
                            ValorPagar = 60000;
                            if (ingresos[i][2] >= 10){
                                for (int in = 10; ingresos[i][2] >= in; in+=10){
                                    ValorPagar += 7000;

                                    ingresos[i][5] = ValorPagar;
                                }
                            }
                        } else {
                            ingresos[i][5] = 1/0; 
                        }
                    }

                } else {
                    if (ingresos[i][3] <= 2) {
                        ValorPagar = 0;
                        ingresos[i][5] = ValorPagar;
                    } else {
                        ValorPagar = 4000 * ingresos[i][3];

                        if(ingresos[i][4] > 4){
                            double largoIncremento = 0.25 * ValorPagar;

                            largoIncremento += ValorPagar;
                            ingresos[i][5] = largoIncremento;
                        } else {
                            ingresos[i][5] = ValorPagar;
                        }

                        
                        
                        
                   
                    }
                }
                    
                    
                                 
            }

            System.out.println("SERVICIO   PRODUCTO        PESO         TIEMPO         LARGO           VALOR");
            
            for(int i = 0; i < ingresos.length; i++) {
                System.out.println(" ");
                for(int ii = 0; ii < ingresos[ii].length; ii++){

                    System.out.print(ingresos[ii][ii] + "           ");
             
                
                }
            }

        }
        
        
        

    }
    
    
    
    
    
    
}