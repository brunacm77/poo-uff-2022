/*
 * Programa que recebe um valor N inteiro e que, se N for positivo, retorna o fatorial de N (N!).
 * Caso nao tenha fatorial, retornar -1
 */
package sintaxejava;

import java.util.Scanner;

/**
 *
 * @author Bruna Moraes
 */
public class Programa5 {

    public static void main(String[] args) {

        int n;

        System.out.println("Digite um valor para N: ");
        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();

        fatorial(n);

    }

    public static int fatorial(int n) {

        int fat = 1;

        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                fat = fat * i;
            }
            System.out.println("Fatorial de " + n + " eh " + n + "! e vale: " + fat);
        } else {
            System.out.println("Nao foi possivel calcular o fatorial");
            return -1;
        }
        return 0;

    }

}
