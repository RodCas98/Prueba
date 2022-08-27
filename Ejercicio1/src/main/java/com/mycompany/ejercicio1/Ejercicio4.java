/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        
       Scanner Teclado = new Scanner(System.in);
        double grados,conversion;

        System.out.println("Ingrese los grados celcius");
        grados = Teclado.nextDouble();
        
        conversion = 32+(9*grados/5);
        
        System.out.println("Los grados en Fahrenheit es "+conversion);

        
    }
}
