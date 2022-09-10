/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner rc = new Scanner(System.in);
        
        int n = (int)(Math.random()*10);
        
        System.out.println("Adivina el numero que estoy pensando");
        int num = rc.nextInt();
        
do {
            System.out.println("Intenta adivinar el número que he pensado. Ingresa tu propuesta: ");
            num = rc.nextInt();
            if (n > num) {
                System.out.println("El número que he pensado es mayor que el introducido");
            } else if (n < num) {
                System.out.println("El número que he pensado es menor que el introducido");
            }
        } while (n != num);

        System.out.println("Has acertado, el número que pensé fue: " + n);
    }
}