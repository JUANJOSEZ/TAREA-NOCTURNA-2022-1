/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduzca un numero : ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.printf(" ES PAR");
        } else {
            System.out.printf(" ES IMPAR");
        }
    }
}
