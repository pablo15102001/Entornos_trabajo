/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosbucles;

import java.util.Scanner;

/**
 *
 * @author 34645
 */
public class ejercicio26 {
    public static void main(String[] args) {
    
        int x;
        int y;
        int copia;
        int contador=0;
        Scanner input = new Scanner (System.in);
        System.out.println("Introduzca un número grande:");
        x = input.nextInt();
        System.out.println("A continuación introduzca un dígito que contenga el número:");
        y = input.nextInt();
        
        copia=x;
        while(copia>=1){
        copia=copia/10;
        contador++;
        }
        for(int i=contador; i>0; i--){
        int resto=x%10;
        x=x/10;
        
        if(resto==y){
        
            System.out.println("El dígito está en la posición "+i+".");
        }
        }
    }
}
