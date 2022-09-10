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
public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner rc = new Scanner(System.in);
        
        int cuadrado;
        
        System.out.println("Introduce numero: ");
        int numero = rc.nextInt();
        
        while (numero>=0) {
cuadrado = numero * numero;
            System.out.println("El cuadrado de "+ numero + " es " + cuadrado);
            System.out.println("Introduce otro numero");
            numero = rc.nextInt();
            
        }
        
    }
}
