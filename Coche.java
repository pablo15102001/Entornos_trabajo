/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo2;

/**
 *
 * @author pablo
 */
public class Coche extends Vehiculos{
    public void andarCoche(){
    kilometrosRecorridos =kilometrosRecorridos +10;
    this.kilometrosTotales =kilometrosTotales +10;
    }
    public void quemaRueda(){
        kilometrosRecorridos =kilometrosRecorridos +13;
        this.kilometrosTotales =kilometrosTotales +13;
        System.out.println("Brum Brum papi");


}
 public void kilometrosCoche(){
        System.out.println("El coche ha recorrido: " + kilometrosRecorridos + " Kilometros");
    }

}
