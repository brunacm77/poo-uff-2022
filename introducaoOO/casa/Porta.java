package casa;

import java.util.Scanner;

/**
 *
 * @author Bruna
 */
public class Porta {

    float altura, comprimento;
    int qtdPortas;
    String cor;
    String tipo;
    Boolean portaAberta = false;

    public void criar()  {

        System.out.println("Crie uma porta... ");
        Scanner inputA = new Scanner(System.in);
        System.out.println("Digite a altura: ");
        altura = inputA.nextFloat();

        Scanner inputC = new Scanner(System.in);
        System.out.println("Digite o comprimento: ");
        comprimento = inputC.nextFloat();
        
        
        if (altura < comprimento) {
            System.out.println("Não é possivel fabricar este tipo de dimensao como porta. Digite valores de altura maior do que de comprimento ");
            
            Scanner inputA1 = new Scanner(System.in);
            System.out.println("Digite a altura: ");
            altura = inputA1.nextFloat();

            Scanner inputC1 = new Scanner(System.in);
            System.out.println("Digite o comprimento: ");
            comprimento = inputC1.nextFloat();
            System.out.println("A porta tem altura " + altura + " e comprimento " + comprimento);
            
        } else {
          System.out.println("A porta tem altura " + altura + " e comprimento " + comprimento);
        }
    } 
    

    void abrir() {

        this.portaAberta = true;
        System.out.println("Abrindo a porta");
    }

    void fechar() {

        this.portaAberta = false;
        System.out.println("Fechando a porta");
    }

    void estaAberta() {

        if (portaAberta == false) {
            System.out.println("A porta está fechada");
        } else {
            System.out.println("A porta está aberta");
        }
    }

    void pintar() {

        Scanner inputNum = new Scanner(System.in);
        System.out.println("Escolha o codigo da cor que quer pintar: ");
        int numeroCor = inputNum.nextInt();

        switch (numeroCor) {

            case 1:
                this.cor = "Branco";
                System.out.println("A porta foi pintada de: " + this.cor);
                break;

            case 2:
                this.cor = "Azul";
                System.out.println("A porta foi pintada de: " + this.cor);
                break;

            case 3:
                this.cor = "Verde";
                System.out.println("A porta foi pintada de: " + this.cor);
                break;

            case 4:
                this.cor = "Lilas";
                System.out.println("A porta foi pintada de: " + this.cor);
                break;

            case 5:
                this.cor = "Preto";
                System.out.println("A porta foi pintada de: " + this.cor);
                break;

            default:
                System.out.println("A porta não pode ser pintada dessa cor");

        }
    }

}
