/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import javax.swing.JOptionPane;


public class ejercicio23 {
    public static void main(String[] args) {
        int n,i, a, d;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        i = 0;
        a = n;
        while (a > 0) {
            d = a % 10;
            i = i * 10 + d;
            a = a / 10;
        }
        if (n== i) {
            JOptionPane.showMessageDialog(null, "capicua");
        } else {
            JOptionPane.showMessageDialog(null, "no capicua");
        }
    }
}

