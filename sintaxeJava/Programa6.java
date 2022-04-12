/*
 * Programa que mostre os primeiros números da série de Fibonacci até passar de 100.
 * 
 */
package sintaxejava;

/**
 *
 * @author Bruna Moraes
 */
public class Programa6 {

    public static void main(String[] args) {

        fibonacci();

    }

    public static void fibonacci() {

        int n = 101;
        int f1 = 0;
        int f2 = 1;
        int aux;

        for (int i = 0; i < n; i++) {
            System.out.println(f1);
            aux = f1;
            f1 = f1 + f2;
            f2 = aux;
        }

    }

}
