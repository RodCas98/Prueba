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
public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        final int ENERO=1;
		final int FEBRERO=2;
		final int MARZO=3;
		final int ABRIL=4;
		final int MAYO=5;
		final int JUNIO=6;
		final int JULIO=7;
		final int AGOSTO=8;
		final int SEPTIEMBRE=9;
		final int OCTUBRE=10;
		final int NOVIEMBRE=11;
		final int DICIEMBRE=12;
		
                
	    int dia,mes,año;
            
	    System.out.println("VERIFICADOR DE FECHA v1.0");
 
	    System.out.println("Dame el dia:");
	    dia=teclado.nextInt();
	    System.out.println(" "+dia);
	    System.out.println("Dame el mes:");
	    mes=teclado.nextInt();
	    System.out.println("Dame el año:");
	    año=teclado.nextInt();
	    System.out.println(" "+año);
            
	    switch(mes)
	    {
	        case ENERO:
	        	System.out.println((dia<=31&&dia>0)?"Fecha valida":"Dia no valido!");
	            break;
	        case FEBRERO:
                        System.out.println((dia<=28&&dia>0)?"Fecha valida":"Dia no valido!");
                        break;         
	        case MARZO:
	        	System.out.println((dia<=31&&dia>0)?"Fecha valida":"Dia no valido!\n");
	            break;
	        case ABRIL:
	        	System.out.println((dia<=30&&dia>0)?"Fecha valida":"Dia no valido!");
	            break;
	        case MAYO:
	        	System.out.println((dia<=31&&dia>0)?"Fecha valida!":"Dia no valido!");
	            break;
	        case JUNIO:
	        	System.out.println((dia<=30&&dia>0)?"Fecha valida!":"Dia no valido!");
	            break;
	        case JULIO:
	        	System.out.println((dia<=31&&dia>0)?"Fecha valida!":"Dia no valido!");
	            break;
	        case AGOSTO:
	        	System.out.println((dia<=31&&dia>0)?"Fecha valida!":"Dia no valido!");
	            break;
	        case SEPTIEMBRE:
	        	System.out.println((dia<=30&&dia>0)?"Fecha valida!":"Dia no valido!");
	            break;
	        case OCTUBRE:
	        	System.out.println((dia<=31&&dia>0)?"Fecha valida!":"Dia no valido!");
	            break;
	        case NOVIEMBRE:
	        	System.out.println((dia<=30&&dia>0)?"Fecha valida!":"Dia no valido!");
	            break;
	        case DICIEMBRE:
	        	System.out.println((dia<=31&&dia>0)?"Fecha valida!":"Dia no valido!");
	            break;
	        default: System.out.println("Mes no válido!");
	    }
 
	}
 
}
        
    
    

