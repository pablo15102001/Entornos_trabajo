/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecuacion2grado;

import java.util.Scanner;

/**
 *
 * @author padia
 */
public class Ecuacion2grado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el valor de a: ");
        int a = entrada.nextInt();
        System.out.println("Dime el valor de a: ");
        int b = entrada.nextInt();
        System.out.println("Dime el valor de a: ");
        int c = entrada.nextInt();
        calculo.calcular(a, b, c);
    }
}
