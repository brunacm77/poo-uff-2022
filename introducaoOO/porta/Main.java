/*
 *  Crie uma porta, abra e feche a mesma, pinte-a de diversas cores
 *  altere suas dimensões e use o método estaAberta para verificar se ela está aberta.
 * 
 */
package porta;

/**
 *
 * @author Bruna Moraes
 */
public class Main {

    public static void main(String[] args) {

        Porta novaPorta = new Porta();

        System.out.println("### Iniciando simulacao ### ");

        novaPorta.criar();
        novaPorta.estaAberta();
        novaPorta.abrir();
        novaPorta.estaAberta();
        novaPorta.alterarDimensao();
        novaPorta.pintar();
        novaPorta.pintar();
        novaPorta.estaAberta();
        novaPorta.fechar();
        novaPorta.estaAberta();
        novaPorta.pintar();

    }

}
