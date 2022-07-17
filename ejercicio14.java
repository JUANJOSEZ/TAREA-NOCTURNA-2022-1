/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = 0;
        int m = 0;
        int h = 0;
        int hs = 0;
        int ms = 0;

        System.out.println("Ingrese  horas:");
        h = sc.nextInt();
        System.out.println("Ingrese minutos:");
        m = sc.nextInt();
        hs = h * 3600;
        ms = m * 60;
        s = hs + ms;
        System.out.println("tiempo en segundos es: " + s);
    }
}
