
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        double num1,num2,suma,resta,multplicacion,division,promedio;
       
        
        Scanner Teclado = new Scanner (System.in);
      
        System.out.println("Ingrese el primer valor");
        num1=Teclado.nextDouble();
        System.out.println("Ingrese el valor 2");
        num2=Teclado.nextDouble();
        
   
        suma=num1+num2;
        resta=num1-num2;
        multplicacion=num1*num2;
        division=num1/num2;
        promedio=(num1+num2)/2;
        
        
        System.out.println("El resultado de la suma es "+suma);
        System.out.println("El resultado de la resta es "+resta);
        System.out.println("El resultado de la multiplicacion es "+multplicacion);
        System.out.println("El resultado de la division es "+division);
        System.out.println("El resultado del promedio es "+promedio);
    }
}
