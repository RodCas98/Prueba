/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ah4;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Banco {

    public static void main(String[] args) {

        int saldocuenta1 = 500;
        int saldocuenta2 = 300;
        int ingresos;
        boolean salir = true;

        Scanner rc = new Scanner(System.in);
        double depositar, retirar;

        System.out.println("\n\tMENU");
        System.out.println("1 . Cuenta 1");
        System.out.println("2 . Cuenta 2");
        int opcion = rc.nextInt();
        while (salir) {
            switch (opcion) {
                case 1:

                    System.out.println("\n\tMENU");
                    System.out.println("1 . Ingresar saldo a la cuenta");
                    System.out.println("2 . Retirar saldo de la cuenta");
                    System.out.println("3 . Consultar saldo de la cuenta");
                    System.out.println("4 . Salir");

                    int opcion1 = rc.nextInt();

                    switch (opcion1) {
                        case 1:
                            System.out.println("\n\tMENU");
                            System.out.println("1 . Que cantidad desea depositar");
                            depositar = rc.nextDouble();
                            saldocuenta1 += depositar;
                            System.out.println("\nDeposito con exito ");
                            break;

                        case 2:
                            System.out.println("\n\tMENU");
                            System.out.println("1 . Que cantidad desea retirar");
                            retirar = rc.nextDouble();
                            saldocuenta1 -= retirar;
                            System.out.println("\nRetiro con exito ");

                            break;

                        case 3:

                            System.out.println("El saldo es " + saldocuenta1);

                            break;

                        case 4:
                            salir = false;

                            break;

                    }

                    break;

                case 2:
                    System.out.println("\n\tMENU");
                    System.out.println("1 . Ingresar saldo a la cuenta");
                    System.out.println("2 . Retirar saldo de la cuenta");
                    System.out.println("3 . Consultar saldo de la cuenta");
                    System.out.println("4 . Salir");

                    int opcion2 = rc.nextInt();

                    switch (opcion2) {
                        case 1:
                            System.out.println("\n\tMENU");
                            System.out.println("1 . Que cantidad desea depositar");
                            depositar = rc.nextDouble();
                            saldocuenta2 += depositar;
                            System.out.println("\nDeposito con exito ");
                            break;

                        case 2:
                            System.out.println("\n\tMENU");
                            System.out.println("1 . Que cantidad desea retirar");
                            retirar = rc.nextDouble();
                            saldocuenta2 -= retirar;
                            System.out.println("\nRetiro con exito ");

                            break;

                        case 3:

                            System.out.println("El saldo es " + saldocuenta2);

                            break;

                        case 4:
                            salir = false;

                            break;

                    }

                    break;
                default:

                    break;
            }

        }
    }

}
