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
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe un número:");
		
		double numero = teclado.nextDouble();
		
		if (numero == 0) {
			System.out.println("El número es neutro");
		} else if (numero < 0) {
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número es positivo");
		}
    }
    
}
