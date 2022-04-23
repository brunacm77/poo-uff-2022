package casa;

import java.util.Scanner;

/**
 *
 * @author Bruna Moraes
 */
public class Casa {

    Porta porta1 = new Porta();
    Porta porta2 = new Porta();
    Porta porta3 = new Porta();

    void criarPorta() {

        porta1.criar();
        porta2.criar();
        porta3.criar();
        
        


        /*  

       for (int i = 1; i <= porta.length; i++) {
            novaPorta.criar();
            System.out.println("A porta " + i + " é: " + novaPorta);
            porta[i] = novaPorta;
            System.out.println("A porta vetor  é: " + porta[i]);
        } */
    }

}
