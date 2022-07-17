/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;


public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anio;
         System.out.println("Ingresa el dia:");
          dia = sc.nextInt();
          System.out.println("Ingresa el mes: ");
           mes = sc.nextInt();
        System.out.println("Ingresa el año: ");
        anio = sc.nextInt();
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            System.out.println("El " + anio + " Si es bisiesto ");
        } else {
            System.out.println("El " + anio + " No es bisiesto ");
        }
    }
}
