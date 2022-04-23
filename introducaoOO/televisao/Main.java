/* Crie uma classe Televisao que se caracteriza por estar ligada ou desligada, pelo volume, pelo canal e 
 *  pelo fato de estar em modo silencioso ou não. Crie métodos para ligar/desligar a televisão, mudar o canal
 *  e silenciar a televisão. Instancie um objeto dessa classe utilize seus métodos para mudar de canal, ligar 
 * e desligar a TV, e imprima o estado da TV.
 */
package televisao;

/**
 *
 * @author Bruna Moraes
 */
public class Main {

    public static void main(String[] args) {

        Televisao novaTv = new Televisao();

        novaTv.statusTv();
        novaTv.ligar();
        novaTv.statusTv();

        for (int i = 0; i < 11; i++) {
            novaTv.aumentarVolume();
        }

        novaTv.statusTv();
        for (int i = 0; i < 3; i++) {
            novaTv.diminuirVolume();
        }

        novaTv.silenciar();
        novaTv.statusTv();
        novaTv.desligar();
        novaTv.statusTv();

        novaTv.ligar();
        novaTv.aumentarVolume();
        novaTv.aumentarVolume();
        novaTv.aumentarVolume();
        novaTv.statusTv();

        novaTv.selecionaCanal();
        novaTv.statusTv();
        
        novaTv.mudarCanal();
        novaTv.statusTv();

    }
}
