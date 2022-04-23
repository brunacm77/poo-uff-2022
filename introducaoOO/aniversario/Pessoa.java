/*
 * Crie uma pessoa, coloque seu nome e idade iniciais, faça alguns aniversários 
 * (aumentando a idade) e imprima seu nome e sua idade.
 * 
 */
package aniversario;

/**
 *
 * @author Bruna Moraes
 */
public class Pessoa {

    String nome;
    int idade;

    
    void fazerAniver(){
        idade++;
    }
    
    void mostrarIdade(){
        System.out.println("A pessoa se chama " + nome + " e tem: " + idade + " anos");
    }
}
