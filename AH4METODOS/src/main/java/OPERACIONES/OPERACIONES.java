package OPERACIONES;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rodri
 */
public class OPERACIONES {
    int numeroCuenta;
    int saldo;
    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
     
    public void depositarDinero(double cantidad){
        saldo += cantidad;
    }
    
    public void retirarDinero(double cantidad){
        saldo -= cantidad;
    }
}
 