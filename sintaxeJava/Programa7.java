/*
 * Programa que mostra o percentual de avaliacao dos funcionarios de um restaurante, que avaliam a qualidade
 * das refeicoes com notas de 0 a 100. Entrada de dados termina quando for lido um valor fora do intervalo.
 */
package sintaxejava;

import java.util.Scanner;

/**
 *
 * @author Bruna Moraes
 */
public class Programa7 {

    public static void main(String[] args) {

        percentual();

    }

    public static void percentual() {

        Scanner input = new Scanner(System.in);

        int nota = 0;
        int notasPessimas = 0;
        int notasRuins = 0;
        int notasBoas = 0;
        int notasOtimas = 0;
        int funcionarios = 0;

        System.out.println("---------------------");

        while ((nota >= 0) || (nota <= 100)) {
            System.out.println("Nota do funcionario: ");
            nota = input.nextInt();
            funcionarios = funcionarios + 1;

            if ((nota >= 0) && (nota <= 100)) {
                if ((nota >= 0) && (nota < 25)) {
                    notasPessimas = notasPessimas + 1;
                    continue;

                } else if ((nota >= 25) && (nota < 50)) {
                    notasRuins = notasRuins + 1;
                    continue;

                } else if ((nota >= 50) && (nota < 75)) {
                    notasBoas = notasBoas + 1;
                    continue;

                } else {
                    notasOtimas = notasOtimas + 1;
                    continue;

                }

            }
            break;

        }
        System.out.println("---------------------");
        System.out.println("Total de funcionarios que avaliaram: " + funcionarios);
        System.out.println("---------------------");
        System.out.println("Percentual de notas Pessimas: " + (notasPessimas * 100 / funcionarios) + "%");
        System.out.println("Percentual de notas Ruins:  " + (notasRuins * 100 / funcionarios) + "%");
        System.out.println("Percentual de notas Boas:  " + (notasBoas * 100 / funcionarios) + "%");
        System.out.println("Percentual de notas Otimas:  " + (notasOtimas * 100 / funcionarios) + "%");

    }

}
