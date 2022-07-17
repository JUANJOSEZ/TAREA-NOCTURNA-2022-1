/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        long n, a, e, i;
        boolean b;
        int ex;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Ingresar un  binario: ");
            n = sc.nextLong();
            b = true;
            a = n;
            while (a != 0) {
                i = a % 10;
                if (i != 0 && i != 1) {
                    b = false;
                }
                a = a / 10;
            }
        } while (!b);
        ex = 0;
        e = 0;
        while (n != 0) {
            i = n % 10;
            e = e + i * (int) Math.pow(2, ex);
            ex++;
            n = n / 10;
        }
        System.out.println("Numero entero: " + e);
    }
}
