/*
 * Programa de soma de 1 até 999
 * 
 */
package sintaxejava;

/**
 *
 * @author Bruna Moraes
 */
public class Programa3 {

    public static void main(String[] args) {

        soma();

    }

    public static void soma() {

        int i;
        int somar = 0;
        for (i = 1; i <= 999; i++) {
            somar = i + somar;
        }
        
        System.out.println(somar);
    }

}
