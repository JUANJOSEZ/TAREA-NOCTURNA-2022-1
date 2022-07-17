/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        double r = 0.0, a = 0.0, b = 0.0, c = 0.0;
        Scanner sc = new Scanner (System.in);
         System.out.println("Ingresa el primer valor: ");
         a = sc.nextInt();
         System.out.println("Ingresa el segundo valor: ");
         b =sc.nextInt();
       System.out.println("Ingresa el tercer valor:"); 
          c =sc.nextInt(); 
        r = (-b +(Math.sqrt(Math.pow(b, 2) + (4*a*c))))/(2*a);      
       System.out.println(r);
    }
}
