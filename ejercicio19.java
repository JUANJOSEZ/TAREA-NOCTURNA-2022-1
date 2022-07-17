/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ejercicio19 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, 1, 1);
        Scanner sc = new Scanner(System.in);
        int mes = date.getMonthValue();
        int dia = date.getDayOfMonth();
        int mesIn, diaIn;

        System.out.println("Ingresa el mes:");
        mesIn = sc.nextInt();
        System.out.println("Ingresa el dia:");
        diaIn = sc.nextInt();
        LocalDate dateIn = LocalDate.of(2014, mesIn, diaIn);

        Period periodo = Period.between(date, dateIn);
        int dias = periodo.getDays();
        int meses = periodo.getMonths();

        System.out.println(date + "\n" + dateIn);
        System.out.println("Han pasado: " + meses + " meses y " + dias + " dias");
    }
}
