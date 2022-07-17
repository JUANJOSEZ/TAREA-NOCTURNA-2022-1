/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio24 {

    public static void main(String[] args) {
        int n = 82, a = 0, r = 0, cd = 0;
        a = n - 1;
        while (a > 1) {
            if (n % a == 0) {
                cd++;
            }
            a--;
        }
        if (cd == 0) {
            JOptionPane.showMessageDialog(null, "Es primo");

        } else {
            JOptionPane.showMessageDialog(null, "No es primo");
        }
    }

}
