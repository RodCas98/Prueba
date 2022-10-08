/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rodri
 */
public class ejercicio2 {

    public static void main(String[] args) {

        //Declarar variables
        int n[][] = new int[8][8];
        //Dar datos al arreglo

        int veces1 = 1;
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {
                n[i][j] = veces1;
                veces1++;
            }
        }

        //Imprimir filas 8
        for (int i = 7; i >= 0; i--) {
            //pares
            if ((i % 2) == 0) {
                //Imprimir columnas8
                for (int j = 7; j >= 0; j--) {
                    System.out.print("          |         " + n[i][j]);

                }
            } //impares
            else {
                //Imprimir columnas8
                for (int j = 0; j < 8; j++) {
                    System.out.print("          |         " + n[i][j]);

                }
            }

            System.out.println("");
        }

    }

}
