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
public class Ejercicio3 {
    public static void main(String[] args) {
        
                int a;
                int b;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("ingrese el primer numero : ");
        a=teclado.nextInt();
        System.out.println("ingrese el sugundo numero : ");
        b=teclado.nextInt();
        
        if(a>b){
            System.out.println("el orden correcto es : "+a+"->"+b);
        }
        
        else{
            System.out.println("el orden de mayor a menor es : "+b+" -> "+a);

            }
    }
 
}

    
    
