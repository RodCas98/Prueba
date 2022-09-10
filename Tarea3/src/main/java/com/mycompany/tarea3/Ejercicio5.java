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
public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner rc = new Scanner(System.in);
        
        int n;
        int suma = 0;
        
        do {
            System.out.println("Introduce numeros: ");
            n = rc.nextInt();
            
            suma += n;
            
        } while (n!=0);
        
        System.out.println("El total de todos los numeros introducidos es "+ suma);
        
    }
    
}
