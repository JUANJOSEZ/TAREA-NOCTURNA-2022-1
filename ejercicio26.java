/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;


public class ejercicio26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        String p = "";
        System.out.println("ingrese la contraseña");
        p = sc.nextLine();
        n = p.length();
            while (n!=10) {
                System.out.println("Vuelva a ingresar 10 digitos: ");
                p = sc.nextLine();
                n = p.length();
            }
             System.out.println("Valida");
        }
    }
