package agendatelefonica;

import java.util.Scanner;

/**
 *
 * @author Bruna Moraes
 */
public class Agenda {

    Boolean agendaVazia = true;
    int numeroDeContatos = 0;
    Boolean ligar = false;
    Contato novoContato = new Contato();

    void criaContato() {

        Scanner contatoNome = new Scanner(System.in);
        System.out.println("Digite o nome do contato: ");
        novoContato.nome = contatoNome.nextLine();

        Scanner contatoSobrenome = new Scanner(System.in);
        System.out.println("Digite o sobrenome");
        novoContato.sobrenome = contatoSobrenome.nextLine();

        Scanner contatoDDD = new Scanner(System.in);
        System.out.println("Digite o DDD com 3 dígitos: ");
        novoContato.ddd = contatoDDD.nextLine();

        Scanner contatoTelefone = new Scanner(System.in);
        System.out.println("Digite o telefone com 9 dígitos: ");
        novoContato.telefone = contatoTelefone.nextLine(); 
        
        numeroDeContatos++;
        System.out.println("O contato " + novoContato.nome + " foi adicionado");

    }

    void contaContatos() {
        
        System.out.println("Quantidade de Contatos na Agenda: " + numeroDeContatos);

    }

    void removeContato() {
        
        if (numeroDeContatos == 0) {
            System.out.println("A agenda já está vazia, não há como remover mais");
        } else {
            numeroDeContatos--;
            System.out.println("O ultimo contato adicionado foi removido");
        }
    }

    void ligarContato() {
        
        if (numeroDeContatos == 0) {
            System.out.println("A agenda está vazia, não há como ligar");
        
        } else {
           
            this.ligar = true;
            System.out.println("Ligando para o contato");
        }

    }

    void statusAgenda() {

        if (numeroDeContatos == 0) {
            agendaVazia = true;
            System.out.println("A agenda esta vazia? " + this.agendaVazia);

        } else {

            agendaVazia = false;
            System.out.println("A agenda esta vazia? " + this.agendaVazia);

        }

    }

    void addContatos() {

        Contato contato1 = new Contato();
        contato1.nome = "Bruna";
        contato1.sobrenome = "Lee";
        contato1.ddd = "021";
        contato1.telefone = "91111-1111";

        Contato contato2 = new Contato();
        contato2.nome = "Thais";
        contato2.sobrenome = "Lee";
        contato2.ddd = "031";
        contato2.telefone = "92222-2222";

        numeroDeContatos = numeroDeContatos + 2;
        System.out.println("Os contatos " + contato1.nome + " e " + contato2.nome + " foram adicionados a agenda");

    }
}
