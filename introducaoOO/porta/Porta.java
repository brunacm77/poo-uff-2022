package porta;

import java.util.Scanner;

/**
 *
 * @author Bruna Moraes
 */
public class Porta {

    float altura, comprimento;
    Boolean portaAberta = false;
    String cor;

    void criar() {

        Porta novaPorta = new Porta();
        novaPorta.altura = 200f;
        novaPorta.comprimento = 60f;
        novaPorta.cor = "branco";
        novaPorta.portaAberta = false;

        System.out.println("A porta criada tem " + novaPorta.altura + " cm e " + novaPorta.comprimento + " cm e tem cor: " + novaPorta.cor);

    }

    void alterarDimensao() {

     do {
        
        System.out.println("Para alterar a dimensão... ");
        Scanner inputA = new Scanner(System.in);
        System.out.println("Digite a altura: ");
        altura = inputA.nextFloat();

        Scanner inputC = new Scanner(System.in);
        System.out.println("Digite o comprimento: ");
        comprimento = inputC.nextFloat();
        
        if ( comprimento > altura ) {
            
            System.out.println("Não é possivel fabricar este tipo de dimensao como porta.");
        }
        
        } while ( comprimento > altura );

        System.out.println("A porta modificada tem " + altura + " cm e " + comprimento + " cm ");
    }
    

    void abrir() {

        this.portaAberta = true;
        System.out.println("Abrindo a porta");
    }

    
    void fechar() {

        this.portaAberta = false;
        System.out.println("Fechando a porta");
    }

    
    void pintar() {

        Scanner inputNum = new Scanner(System.in);
        System.out.println(" -------------------- ");
        System.out.println(" Escolha um codigo de tinta para a porta: ");
        System.out.println(" cod 1 | Branco ");
        System.out.println(" cod 2 | Azul ");
        System.out.println(" cod 3 | Verde ");
        System.out.println(" cod 4 | Lilas ");
        System.out.println(" cod 5 | Preto ");
        System.out.println(" -------------------- ");
        int numeroCor = inputNum.nextInt();
        System.out.println(" Pintando a porta... ");
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

    void estaAberta() {

        if (portaAberta == false) {
            System.out.println("A porta está fechada");
        } else {
            System.out.println("A porta está aberta");
        }
    }
}
