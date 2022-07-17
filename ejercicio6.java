/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        double a = 0.0, b = 0.0, r = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer cateto: ");
        a = sc.nextDouble();
        System.out.print("Ingese el segundo cateto: ");

        b = sc.nextDouble();
        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        r = Math.sqrt(a + b);

        System.out.println("La hipotenusa es: " + r);
    }
}
