/*
 * Programa que retorna todos os múltiplos de 3, entre 1 e 100
 * 
 */
package sintaxejava;

/**
 *
 * @author Bruna Moraes
 */
public class Programa4 {

    public static void main(String[] args) {

        multiplo();

    }

    public static void multiplo() {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {

                System.out.println(i);
            }

        }

    }
}
