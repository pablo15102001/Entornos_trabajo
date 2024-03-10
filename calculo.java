/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecuacion2grado;

/**
 *
 * @author padia
 */
public class calculo {
    public static void calcular(int a, int b, int c) {
        int Discriminante, x1, x2;
        Discriminante = discriminante.Calcular (a, b, c);
        if (Discriminante < 0) {
        System.out.println("Indeterminado");
        } else if (Discriminante > 0) {
            x1 = (int) ((-b + Math.sqrt(Discriminante)) / 2 * a);
            x2 = (int) ((-b - Math.sqrt(Discriminante)) / 2 * a);
            System.out.println("x1="+x1+" x2="+x2);
        } else {
            x1 = b/2*a;
            System.out.println("x1="+x1);
        }
    }
}
