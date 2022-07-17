/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

public class ejercicio18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kg, libras, estatura, metros, imc;
        String cl = "";

        System.out.print("Ingrese peso en libras: ");
        libras = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingrese estatura en centimetros: ");
        estatura = sc.nextInt();
        sc.nextLine();

        metros = estatura * 0.01;
        kg = libras * 0.453;

        System.out.println("Valor en KG es: " + kg);

        imc = kg / Math.pow(metros, 2);

        if (imc < 16) {
            cl = "Criterio de ingreso";
        } else if (imc >= 16 && imc <= 16.9) {
            cl = "Infrapeso";
        } else if (imc >= 17 && imc <= 18.4) {
            cl = "Bajo Peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            cl = "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            cl = "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            cl = "Obesidad pre-mórbida";
        } else if (imc >= 45) {
            cl = "obesidad híper-mórbida.";
        }
        System.out.println("Indice de masa corporal: " + imc);
        System.out.println("Tiene: " + cl);

    }
}
