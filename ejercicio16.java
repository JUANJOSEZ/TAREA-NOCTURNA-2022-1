/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;


public class ejercicio16 {
    public static void main(String[] args) {
        double r = 0.0, a = 0.0, b = 0.0, c = 0.0;
        int n1 = 0, n2 = 0, n3 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la primera variable:");
        a = input.nextDouble();
        System.out.println("Ingresa la segunda variable :");
        b = input.nextDouble();
        System.out.println("Ingresa la tercera variable:");
        c = input.nextDouble();
        r = (-b + (Math.sqrt(Math.pow(b, 2) + (4 * a * c)))) / (2 * a);
        System.out.println(r);
        System.out.println("Ingrese el primer numero:");
        n1 = input.nextInt();
        System.out.println("Ingrese el segundo numero:");
        n2 = input.nextInt();
        System.out.println("Ingrese el tercer numero:");
        n3 = input.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " es el mayor");
            if (n2 > n3) {
                System.out.println( n2 + " es el segundo mayor");
                System.out.println( n3 + " es el menor");
            } else {
                System.out.println( n3 + " es el segundo mayor");
                System.out.println( n2 + " es el menor");
            }
        } else if (n2 > n1 && n2 > n3) {
            System.out.println( n1 + " es el mayor");
            if (n1 > n3) {
                System.out.println( n1 + " es el segundo mayor");
                System.out.println(n3 + " es el menor");
            } else {
                System.out.println(n3 + " es el segundo mayor");
                System.out.println( n1 + " es el menor");
            }
        } else if (n3 > n1 && n3 > n2) {
            System.out.println( n3 + " es el mayor");
            if (n1 > n2) {
                System.out.println( n1 + " es el segundo mayor");
                System.out.println( n2 + " es el menor");
            } else {
                System.out.println( n2 + " es el segundo mayor");
                System.out.println( n1 + " es el menor");
            }
        }
    }
}
