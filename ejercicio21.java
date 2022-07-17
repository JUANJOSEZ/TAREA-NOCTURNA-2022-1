/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;


public class ejercicio21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double mc, dc = 0.020, tp;
        System.out.print("Ingrese el monto de su compra : ");
        mc = sc.nextDouble();       
        dc = mc * 0.020;
        tp= mc-dc;      
        if (mc <= 999) {
            System.out.println("Sin descuento");
            System.out.println("Total a pagar: "+mc);
        } else if (mc >= 1000) {
            System.out.println("Su descuento es de: "+dc);
             System.out.println("Total a pagar: "+tp);
        }
    }
}
    

