/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Scanner;
import static java.lang.Math.*;

/**
 *
 * @author rodri
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        double radio, longitud, area;

        System.out.println("Ingrese el radio de la circunferencia");
        radio = Teclado.nextDouble();

        longitud = 2 * PI * radio;
        area = PI * Math.pow(radio, 2);

        System.out.println("La longitud de la circunferencia es " + longitud);
        System.out.println("El area de la circunfenrcia es " + area);

    }

}
