

package parcial.wanda;

import java.util.Scanner;

public class App {

    double kilometro1 = 0;
    double metrosVehiculo2 = 0;
    double metrosVehiculo3 = 0;
    int cantidadVehiculos = 0;
    double resultado1 = 0;
    double litrosGasolina1 = 0;
    double kilometro2 = 0;
    double litrogasolina2 = 0;
    double kilometro3 = 0;

    
   


    public static void main(String[] args) {  
        // Implementar la logica de solucion

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de vehiculos: ");
        int cantidadVehiculos = sc.nextInt();

        try {
            if (cantidadVehiculos > 0) {
                Scanner metroScanner = new Scanner(System.in);
                System.out.println("ingrese los metros recorridos por el vehiculo 1: ");
                double metroVehiculo1 = metroScanner.nextInt();

                kilometro1 = (metroVehiculo1 / 1000);
                litrosGasolina1 = (kilometro1 * 55)/750;
                

                resultado1 = kilometro1 + litrosGasolina;


                
            }else if (metrosVehiculo2 > 0) {
                System.out.println("ingrese los mestros recorridos por el vehiculo 2: ");
                double metrosVehiculo2 = metroScanner.nextInt();

                kilometro2 = (metrosVehiculo2 / 1000);
                litrogasolina2 = (kilometro2 * 55)/750;
                   
            }else if (metrosVehiculo3 > 0 ) {
                System.out.println("ingrese la cantidad de metros recorridos por el vehiculo 3: ");
                double metrosVehiculo3 = metroScanner.nextInt();

                kilometro2 = (metrosVehiculo3 / 1000);
                litrogasolina2 = (kilometro3 * 55)/750;


                
            }else {

            }
            
        } catch (Exception e) {
            
        }
        
    }

    /*  Implemente una funcion llamada calcularConsumoGasolina que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Un float representando los km recorridos
        * Retorna:
            - Un float representando los litros de gasolina consumidos
    */
    //------------------------------------------------------------------
    //Implemente la funcion en este espacio
    public static float calcularConsumoGasolina(float kmRecorrido){

       int  GaslinaTotal = litrosGasolina1 + litrogasolina2 + 

        





        return ((kmRecorrido * 55) / 750);
    }
    //------------------------------------------------------------------

}
