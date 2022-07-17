/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ejercicio25 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vc = 0;
         System.out.print("Indica el numero a calcular su factorial: ");
         vc= sc.nextInt();
        while (vc< 1) {
            try {
                vc = sc.nextInt();
                if (vc < 1) {
                    System.out.println("El valor tiene que ser superior a 0");
                }
            } catch (InputMismatchException e) {
                System.out.println("El valor tiene que ser numerico...");
                sc.nextLine();
            }
        }
        long f = 1L;
        for (int i = vc; i > 0; i--) {
            f = f * i;
        }
        System.out.println("El factorial de " + vc+ " es " + f);
    }
}

