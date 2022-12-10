//Jogo de Craps. 
//Faça um programa de implemente um jogo de Craps. 
//O jogador lança um par de dados, obtendo um valor entre 2 e 12. 
//Se, na primeira jogada, você tirar 7 ou 11, você um "natural" e ganhou. 
//Se você tirar 2, 3 ou 12 na primeira jogada, isto é chamado de "craps" e você perdeu. 
//Se, na primeira jogada, você fez um 4, 5, 6, 8, 9 ou 10,este é seu "Ponto". 
//Seu objetivo agora é continuar jogando os dados até tirar este número novamente. 
//Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente.
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.Scanner;


public class ex10 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> historicoPontos = new ArrayList<Integer>();

        int rodadas = 1;

        while (true) {
            System.out.println("------------------------");
            System.out.println("Rodada " + rodadas);
            System.out.println("------------------------");
            System.out.println("Girando dados...");
            int pontos = giraDados();

            if((rodadas == 1) && (pontos == 7 || pontos == 11)){
                System.out.println("VOCÊ VENCEU!!!");
                break;
            } else if((rodadas == 1) && (pontos == 2 || pontos == 3 || pontos == 12)){
                System.out.println("CRAPS!!!!");
                System.out.println(" YOU LOSE!");
                break;
            }

            historicoPontos.add(pontos);

            if((rodadas != 1) && (pontos == historicoPontos.get(0))){
                System.out.println("VOCÊ GANHOU, COM " + pontos + " pontos" + " 2x");
                break;
            }
            
            if((rodadas != 1) && (pontos == 7)){
                System.out.println("VOCÊ PERDEU");
                break;
            }

            System.out.print("Deseja girar novamente ? [S/N] ");
            String resp = teclado.next();

            if(resp.equalsIgnoreCase("N")){
                break;
            }

            teclado.close();

            rodadas++;
        }  
    }

    public static int giraDados() {
        int dado1 = randomDados();
        int dado2 = randomDados();
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        int pontos = somaDados(dado1, dado2);
        System.out.println("A soma dos dados foi " + pontos);
        return pontos;
    }

    public static int somaDados(int dado1, int dado2) {
        return (dado1 + dado2);
    }
    

    public static int randomDados() {
        return (int) Math.floor(Math.random() * (7 - 1) + 1);
    }
}

        
    

