/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_2;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        
        
        int num1, num2;
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer valor");
        num1 = Teclado.nextInt();
        System.out.println("Ingrese el valor 2");
        num2 = Teclado.nextInt();

System.out.println((num1==num2)?"Son iguales":"No son iguales");
    }
    
}
