/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ejercicio15 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, h, m;
        System.out.print("Ingrese los segundos : ");
        s = sc.nextInt();
        h = s / 3600;
        m = s / 60;
        System.out.println("Horas : " + h);
        System.out.println(" Minutos : " + m);
    }
}
