/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  numero=0.0;
        System.out.println("Escribe un numero:");
        numero = sc.nextDouble();
        if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Positivo");
        }
    }
}
