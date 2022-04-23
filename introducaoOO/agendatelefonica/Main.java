/*
 *  Faça um programa de agenda telefônica, com as classes Agenda e Contato
 * 
 * 
 */
package agendatelefonica;

/**
 *
 * @author Bruna Moraes
 */
public class Main {

    public static void main(String[] args) {

        Agenda novaAgenda = new Agenda();
        

        System.out.println("### Inicio da simulacao ###");
        
        novaAgenda.statusAgenda();
        novaAgenda.criaContato();
        novaAgenda.contaContatos();
        novaAgenda.criaContato();
        novaAgenda.ligarContato();
        novaAgenda.contaContatos();
        novaAgenda.removeContato();
        novaAgenda.contaContatos();
        novaAgenda.statusAgenda();
        novaAgenda.removeContato();
        novaAgenda.contaContatos();
        novaAgenda.statusAgenda();
        novaAgenda.ligarContato();
        novaAgenda.removeContato();
        novaAgenda.addContatos();
        novaAgenda.contaContatos();
        novaAgenda.statusAgenda();
        novaAgenda.removeContato();
        novaAgenda.contaContatos();

   
    }

}
