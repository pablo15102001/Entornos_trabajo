/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo2;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Poo2 {

    public static void main(String[] args) {
        Vehiculos vehiculos = new Vehiculos();
        Bicicleta bici = new Bicicleta();
        Coche coche = new Coche();
        Scanner scanner = new Scanner (System.in);
            int opcion;
           do {
            System.out.println("VEHICULOS"
                    + "________");
            System.out.println("1. Andar con la bicicleta");
            System.out.println("2. Haz el caballito con la bici");
            System.out.println("3. Andar con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. ver kilometraje de la bici");
            System.out.println("6. ver kilometraje del coche");
            System.out.println("7. ver kilometros totales");
            System.out.println("8. salir");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    bici.andarBici();
                    break;
                case 2:
                    bici.caballito();
                    break;
                case 3:
                    coche.andarCoche();
                    break;
                case 4:
                    coche.quemaRueda();
                    break;
                case 5:
                    bici.kilometrosBici();
                    break;
                case 6:
                     coche.kilometrosCoche();
                    break;
                case 7:
                    vehiculos.verTotal();
                    break;
                case 8:
                    System.out.println("Hasta luegoo");
                    break;
                    
            }
           }while (opcion !=8);
}

}
