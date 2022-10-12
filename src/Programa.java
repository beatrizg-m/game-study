import jogo.Golpe;
import jogo.Lutador;
import java.util.Scanner;
public class Programa {

    public static void main(String[] args) throws Exception {
        
        Golpe soco = new Golpe("soco", 2, 10);
        Golpe chute = new Golpe("chute", 4, 20);
        Golpe porrada = new Golpe("porrada", 8, 40);
        Golpe[] golpes = { soco, chute, porrada };

        Lutador lutador1 = new Lutador("Carlos", golpes);
        Lutador lutador2 = new Lutador("Vanessa", golpes);

        Scanner sc = new Scanner(System.in);
        Lutador round = lutador1;
        Lutador victim = lutador2;

        while (lutador1.getVida() > 0 && lutador2.getVida() > 0){
            System.out.println("Escolha seu golpe: ");
            int golpe = sc.nextInt();

            System.out.println(lutador1.getGolpes()[golpe - 1].getNomeGolpe());

            round.setEnergia(round.getEnergia() - round.getGolpes()[golpe - 1].getEnergiaGolpe());

            victim.setVida(victim.getVida() - round.getGolpes()[golpe -1].getDanoGolpe());

            System.out.println(lutador1.getVida());
            System.out.println(lutador2.getVida());

            if (round == lutador1) {
                round = lutador2;
                victim = lutador1;
            } else {
                round = lutador1;
                victim = lutador2;
            }
        }

        if (lutador1.getVida() > lutador2.getVida()){
            System.out.printf(" %s Venceu essa partida!%n", lutador1.getNome());

        }
        else{
            System.out.printf("%s Venceu essa partida!%n", lutador2.getNome());
        }

        sc.close();
    }
}
