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
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        int num, doble, triple;

        System.out.println("Ingrese un digito");
        num = Teclado.nextInt();

        doble = num * 2;
        triple = num * 3;

        System.out.println("El numero ingresado es " + num);
        System.out.println("El doble es " + doble);
        System.out.println("El triple es " + triple);

    }

}
