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
public class Ejercicio4 {
    
    public static void main(String[] args) {
        int a,b,c;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca primer número: ");
        a=teclado.nextInt();
        System.out.println("Introduzca segundo número: ");
        b=teclado.nextInt();
        System.out.println("Introduzca tercer número: ");
        c=teclado.nextInt();

        if(a>b && b>c)
            System.out.println( a+", "+b+", "+c);
        else{
            if(a>c && c>b)
                System.out.println(a+", "+c+", "+b);
            else{
               if(b>a && a>c)
                   System.out.println(b+", "+a+", "+c);
               else{
                  if(b>c && c>a)
                      System.out.println(b+", "+c+", "+a);
                  else{
                      if(c>a && a>b)
                         System.out.println(c+", "+a+", "+b);
                      else{
                         if(c>b && b>a)
                            System.out.println(c+", "+b+", "+a);
                        }
                      }
                   }
                }
            }
        }
    }    
    
    

   

