/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;


public class ejercicio11 {
    public static void main(String[] args) {
int n=0,m=0, c=0, d=0, u=0;
	 Scanner escaner = new Scanner(System.in);
	System.out.println("Ingrese numero: ");
	n = escaner.nextInt();

	 m=n/1000;
	 c=(n-(m*1000))/100;
	 d=(n- (m*1000 + c*100))/10;
	 u=n-(m*1000 + c*100 + d*10 );

	System.out.println("Millares = "+ m);
	System.out.println("Centenas = "+ c);
	System.out.println("Decenas = "+ d);
	System.out.println("Unidades = "+ u);
    }
}

