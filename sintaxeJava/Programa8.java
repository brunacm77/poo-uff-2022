/*
 * Desenvolva um programa que leia do usuário uma matriz quadrada de ordem n,
 * e mostre se a matriz é um quadrado mágico ou não.  [Exercicio Incompleto, em construcao]
 */
package sintaxejava;

import java.util.Scanner;

/**
 *
 * @author Bruna Moraes
 */
public class Programa8 {

    public static void main(String[] args) {

        int linha, coluna;

        System.out.println("Digite a qtde de linha da matriz: ");
        Scanner inputLinha = new Scanner(System.in);
        linha = inputLinha.nextInt();

        System.out.println("Digite a qtde de coluna da matriz: ");
        Scanner inputColuna = new Scanner(System.in);
        coluna = inputColuna.nextInt();

        while (linha != coluna) {
            System.out.println("Nao e possivel verificar se e magico, pois precisa ser uma matriz quadrada");

            System.out.println("Digite a qtde da linha da matriz: ");
            Scanner inputLinha1 = new Scanner(System.in);
            linha = inputLinha1.nextInt();

            System.out.println("Digite a qtde da coluna da matriz: ");
            Scanner inputColuna1 = new Scanner(System.in);
            coluna = inputColuna1.nextInt();
        }
        System.out.println("matriz e: " + "[" + linha + "]" + "x" + "[" + coluna + "]");

        int[][] matriz = new int[linha][coluna];

        System.out.println("Digite os valores do vetor: ");
        Scanner inputValor = new Scanner(System.in);
        int valor = inputValor.nextInt();

        //matriz = magico();
    }

    public static void magico(int matriz[][]) {

        int soma = 0;
        int soma2 = 0;

        for (int j = 0; j < matriz[0].length; j++) {
            soma = soma + matriz[0][j];
        }
        //soma linha
        for (int i = 1; i < matriz[0].length; i++) {
            soma2 = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma2 = soma2 + matriz[i][j];
            }
            if (soma != soma2) {
                System.out.println("A matriz nao e quadrado magico");
            }

            // soma coluna
            for (int j = 0; j < matriz[0].length; j++) {
                soma2 = 0;
                for (i = 0; j < matriz[0].length; i++) {
                    soma2 = soma2 + matriz[i][j];
                }
                if (soma2 != soma) {
                    System.out.println("A matriz nao e quadrado magico");
                }

                //soma diagonal principal
                soma2 = 0;
                for (i = 0; i < matriz.length; i++) {
                    soma2 = soma2 + matriz[i][i];
                }
                if (soma2 != soma) {
                    System.out.println("A matriz nao e quadrado magico");

                }
                soma2 = 0;
                i = 0;
                for (j = matriz.length - 1; j >= 0; j--) {
                    soma2 = soma2 + matriz[i][j];
                    i++;

                }
                if (soma2 != soma) {
                    System.out.println("A matriz nao e quadrado magico");
                } else {
                    System.out.println("E quadrado magico");
                }
            }
        }
    }
}
