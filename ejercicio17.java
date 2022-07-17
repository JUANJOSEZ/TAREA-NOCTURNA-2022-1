/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ejercicio17 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int h = 0;
        System.out.print("Cantidad de horas: ");
        h = sc.nextInt();
        System.out.println("Precio: " + cp(h));
    }

    public static double cp(int h) {
        double p = 0;
        if (h <= 3) {
            p = h * 20;
        } else if (h > 3 && h <= 24) {
            p = (3 * 20) + ((h - 3) * 15);
            if (h == 24) {
                p = 250;
            }
        } else if (h > 24) {
            p = ((int) (h / 24)) * 250 + (h % 24 * 15);
        }
        return p;
    }
}
