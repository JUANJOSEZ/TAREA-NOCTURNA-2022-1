/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

public class ejercicio9 {
    public static boolean findParity(int  bn) {

        bn = (bn & 0x0000FFFF) ^ (bn >> 16);
        bn = (bn & 0x000000FF) ^ (bn >> 8);
        bn = (bn & 0x0000000F) ^ (bn >> 4);
        bn = (bn & 0x00000003) ^ (bn >> 2);
        bn = (bn & 0x00000001) ^ (bn>> 1);

        return (bn & 1) == 1;
    }

    public static void main(String[] args) {
        int x = 420;
        System.out.println(x + "Binario " + Integer.toBinaryString(x));
        if (findParity(x)) {
            System.out.println(x + " bits impares");
        } else {
            System.out.println(x + " bits pares");
        }
    }
}
