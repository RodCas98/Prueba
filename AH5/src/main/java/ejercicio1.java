
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rodri
 */
public class ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner rc = new Scanner(System.in);
        
        //declarar variables 
        int n [] = new int [15];
        String n1 = "";
        //Hacer un while que cicle 15 veces
        
        int veces = 0;
        while (veces < 15 ) {  
            //Pedir 15 valores numericos 
            System.out.println("Ingrese el valor no "+(veces+1));
            n1 = rc.next();
            n[veces]= Integer.parseInt(n1);
            veces ++;
        }
        //Reinicio de contador
        veces = 0;
        //imprime filas 3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                //impreme columnas 5
                System.out.print("      |       "+n[veces]);
                veces ++;     

            }
            System.out.println("");
        }
        
        //Imprimir los valores 
        
    }
}
