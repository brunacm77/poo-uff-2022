/*
 * Programa que recebe n valores de input e retorna a quantidade de numeros negativos
 * 
 */
package sintaxejava;

import java.util.Scanner;

/**
 *
 * @author Bruna Moraes
 */
public class Programa1 {

    public static void main(String[] args) {

        System.out.println("Digite seu numero n ");

        negativo();

    }

    public static void negativo() {

        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        int contador = 1;

        while (numero != 0) {

            System.out.println("Digite seu proximo numero n ");
            Scanner input2 = new Scanner(System.in);
            numero = input2.nextInt();

            if (numero < 0) {

                ++contador;

            }

        }
        System.out.println("A qtde de numeros negativos e " + contador);
    }

}
