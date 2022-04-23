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
