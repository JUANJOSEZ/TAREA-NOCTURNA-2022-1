/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ejercicio20 {

    public static void main(String[] args) {
        int m = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para validar un mes: ");
        m = sc.nextInt();
        switch (m) {
            case 1:
                System.out.println("El mes correspondiente es es Enero");
                break;
            case 2:
                System.out.println("El mes correspondiente es Febrero");
                break;
            case 3:
                System.out.println("El mes correspondiente es Marzo");
                break;
            case 4:
                System.out.println("El mes correspondiente es Abril");
                break;
            case 5:
                System.out.println("El mes correspondiente es Mayo");
                break;
            case 6:
                System.out.println("El mes correspondiente es Junio");
                break;
            case 7:
                System.out.println("El mes correspondiente es Julio");
                break;
            case 8:
                System.out.println("El mes correspondiente es Agosto");
                break;
            case 9:
                System.out.println("El mes correspondiente es Septiembre");
                break;
            case 10:
                System.out.println("El mes correspondiente es Octubre");
                break;
            case 11:
                System.out.println("El mes correspondiente es Noviembre");
                break;
            case 12:
                System.out.println("El mes correspondiente es Diciembre");
                break;
        }
    }
}
