/*
 * Crie uma pessoa, coloque seu nome e idade iniciais, faça alguns aniversários (aumentando a idade) 
 *  e imprima seu nome e sua idade.
 * 
 */
package aniversario;

/**
 *
 * @author Bruna
 */
public class Main {

    public static void main(String[] args) {

        Pessoa humana = new Pessoa();

        humana.nome = "Bruna";
        humana.idade = 28;

        humana.mostrarIdade();
        humana.fazerAniver();
        humana.mostrarIdade();
        humana.fazerAniver();
        humana.fazerAniver();

        for (int i = 2; i < 5; i++) {
            humana.fazerAniver();
            System.out.println("Apos " + i + " anos...");
        }
        humana.mostrarIdade();

    }

}
