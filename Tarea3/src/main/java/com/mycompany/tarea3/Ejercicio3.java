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
public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner rc = new Scanner(System.in);
        
        System.out.println("Introduce numero y te indicare si es par o impar ");
        int numero = rc.nextInt();
        
        while (numero!=0) {
        if(numero%2==0) {
            System.out.println("El numero "+ numero + "es par");           
        }
        else  {
            System.out.println("El numero "+ numero + "es impar");
        
        }
        System.out.println("Introduce otro numero ");
         numero = rc.nextInt();
    }
    

}

}
