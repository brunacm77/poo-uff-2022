package televisao;

import java.util.Scanner;

/**
 *
 * @author Bruna Moraes
 */
public class Televisao {

    int volume, canal, proxCanal, anteriorCanal, novoCanal;
    boolean estaSilenciosa;
    boolean estaLigada;

    void ligar() {

        estaLigada = true;
        System.out.println("A Tv está sendo ligada... ");
    }

    void desligar() {

        estaLigada = false;
        System.out.println("A Tv está sendo desligada... ");
    }

    void aumentarVolume() {

        System.out.println("--------");
        if (volume > 9) {
            System.out.println("Está no volume máximo. Não é possível aumentar o volume.");
        } else {
            volume++;
            System.out.println("Aumentando volume... ");
            System.out.println("Novo volume é: " + volume);
        }

    }

    void diminuirVolume() {

        System.out.println("--------");
        if (volume < 0) {
            System.out.println("A Tv está silenciosa. Não é possível diminuir o volume. ");
        } else {
            volume--;
            System.out.println("Diminuindo volume... ");
            System.out.println("Novo volume é: " + volume);
        }
    }

    void silenciar() {

        System.out.println("Silenciando a Tv... ");
        if (estaSilenciosa == false) {
            estaSilenciosa = true;
            volume = 0;
        } else {
            System.out.println("A Tv já está silenciosa");
        }
    }

    void selecionaCanal() {

        System.out.println("--------");
        System.out.println("Escolha o canal: ");
        Scanner input = new Scanner(System.in);
        int novoCanal = input.nextInt();

        if (novoCanal < 0 || novoCanal > 99) {
            System.out.println("Canal inválido");
            System.out.println("Escolha o canal entre 0 e 99: ");
            Scanner input2 = new Scanner(System.in);
            novoCanal = input2.nextInt();
            canal = novoCanal;

        } else {

            canal = novoCanal;
        }

    }

    void mudarCanal() {
        
        System.out.println("Canal Atual é: " + canal);
        System.out.println("--------");
        System.out.println("Escolha 1 para retornar ao canal anterior e 2 para avançar de canal");
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        
        switch (select) {
            
            case 1:
                System.out.println("Ir para canal anterior.. ");
                canal --;
                System.out.println("Canal Anterior é: " + canal);
                break;
            case 2:
                System.out.println("Ir para proximo canal.. ");
                canal++;
                System.out.println("Novo Canal é: " + canal);
                break;
            default:
                System.out.println("Escolha inválida");
                break;
        }
    }

    
    void statusTv() {
        
        System.out.println("--------");
        System.out.println("Esta ligada? " + estaLigada);

        if (estaLigada == false) {
            
            System.out.println("A Tv está desligada");
        
        } else {
           
            System.out.println("Está no canal: " + canal);
            System.out.println("O volume é: " + volume);

            if (volume == 0) {
               
                estaSilenciosa = true;
                System.out.println("Esta silenciosa? " + estaSilenciosa);
            
            } else {
                estaSilenciosa = false;
                System.out.println("Esta silenciosa? " + estaSilenciosa);
            }

        }
    }
}
