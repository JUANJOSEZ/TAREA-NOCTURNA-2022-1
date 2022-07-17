/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ejercicio13 {
     public static void main(String[] args) {
        int n=0, a=0, i = 0, c=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Ingrese un numero: ");
            n = sc.nextInt();
        } while (n < 10);
        a= n;
        while (a != 0) {
            c = a % 10;
            i = i * 10 + c;
            a = a / 10;
        }
        if (n == i) {
            System.out.println("capicua");
        } else {
            System.out.println("No capicua");
        }
    }
}
