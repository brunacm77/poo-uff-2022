/*
 * Programa que le 3 valores reais e retorna o maior deles
 * 
 */
package sintaxejava;

import java.util.Scanner;

/**
 *
 * @author Bruna Moraes
 */
public class Programa2 {
    
     public static void main(String[] args) {
         
       
        maior ();
        
}

public static void maior (){
    
    System.out.println("Digite o valor de R ");
    Scanner input = new Scanner(System.in);
    float valorR = input.nextFloat(); 
    
    System.out.println("Digite o valor de S ");
    Scanner input2 = new Scanner(System.in);
    float valorS = input2.nextFloat(); 
        
    System.out.println("Digite o valor de T ");
    Scanner input3 = new Scanner(System.in);
    float valorT = input3.nextFloat(); 
    
    if ((valorR > valorS) && (valorR > valorT)){
    System.out.println("O maior e o R ");
    }   else if (valorS > valorT){
    System.out.println("O maior e o S ");
    }   else   {
        System.out.println("O maior e o T ");
    }
    
}
        
}
        