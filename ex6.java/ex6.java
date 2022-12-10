import java.util.Scanner;

//Faça um programa que converta da notação de 24 horas para a notação de 12 horas. 
//Por exemplo, o programa deve converter 14:25 em 2:25 P.M. A entrada é dada em dois inteiros. 
//Deve haver pelo menos duas funções: uma para fazer a conversão e uma para a saída. 
//Registre a informação A.M./P.M. como um valor ‘A’ para A.M. e ‘P’ para P.M. 
//Assim, a função para efetuar as conversões terá um parâmetro formal para registrar se é A.M. ou P.M. 
//Inclua um loop que permita que o usuário repita esse cálculo para novos valores de entrada todas as vezes 
//que desejar.

public class ex6 {

    public static void main(String[] args) {

        int horas, minutos;

        String opcao = "s";
        Scanner teclado = new Scanner(System.in);

        while (opcao.equals("s")) {

            System.out.println("Informe as horas: ");
            horas = teclado.nextInt();
            teclado.nextLine();
            
            System.out.println("Informe os minutos: ");
            minutos = teclado.nextInt();
            teclado.nextLine();

            teclado.close();

            if (horas > 12) {
                // converter a hora para notação A.M / P.M
                horas = horas - 12;
                // P.M

                imprimeHorario(horas, minutos, 'P');

            } else if (horas == 12) {
                imprimeHorario(horas, minutos, 'P');

            } else if (horas == 24) {
                horas = 0;
                imprimeHorario(horas, minutos, 'A');

            } else {
                // A.M
                imprimeHorario(horas, minutos, 'A');
            }

            System.out.print(" Deseja converter mais um número? ");
            opcao = teclado.nextLine();
        }

    }

    static void imprimeHorario(int h, int m, char t) {
        System.out.print(h + ":" + m + " " + t + ".M");
    }
}
