/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo2;

import java.util.Random;



/**
 *
 * @author pablo
 */
public class Bicicleta extends Vehiculos {
   private Random random = new Random();
    public void andarBici(){
    kilometrosRecorridos = kilometrosRecorridos +2;
    this.kilometrosTotales= kilometrosTotales + 2;
    }
    public void caballito(){
        kilometrosRecorridos =kilometrosRecorridos +3;
        this.kilometrosTotales =kilometrosTotales +3;
        int teCaes = random.nextInt(5) + 1;
        if(teCaes == 1){
            System.out.println("Vaya hostion me he calzado...");
        } else {
        System.out.println("esta guapo pero cuidado...");
        }
    }
    public void kilometrosBici(){
        System.out.println("La bici ha recorrido: " + kilometrosRecorridos + " Kilometros");
    }

}
