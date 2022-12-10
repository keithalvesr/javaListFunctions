//Faça um programa que use a função valorPagamento para determinar o valor a ser pago 
//por uma prestação de uma conta. O programa deverá solicitar ao usuário o valor da prestação 
//e o número de dias em atraso e passar estes valores para a função valorPagamento, 
//que calculará o valor a ser pago e devolverá este valor ao programa que a chamou. 
//O programa deverá então exibir o valor a ser pago na tela. 
//Após a execução o programa deverá voltar a pedir outro valor de prestação 
//e assim continuar até que seja informado um valor igual a zero para a prestação. 
//Neste momento o programa deverá ser encerrado, exibindo o relatório do dia, que conterá a 
//quantidade e o valor total de prestações pagas no dia. O cálculo do valor a ser pago é feito 
//da seguinte forma. Para pagamentos sem atraso, cobrar o valor da prestação. 
//Quando houver atraso, cobrar 3% de multa, mais 0,1% de juros por dia de atraso.

import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {

        double valorPagamento, valorPrestacao = 1;

        int diasAtrasos;
        
        double valorTotal = 0;

        int qntdPrestacao = 0;

        boolean continuar = true;
       

      while (continuar) {
        
         Scanner teclado = new Scanner(System.in);
         System.out.println("Informe o valor da Prestação: ");
         valorPrestacao = teclado.nextDouble();

        if (valorPrestacao <= 0) {
            continuar = false;
            break;
        }

         System.out.println("Informe os dias em atrasos: ");
         diasAtrasos = teclado.nextInt();

         System.out.println("O valor da prestação é: " + valorPagamento(valorPrestacao, diasAtrasos));

          valorTotal = valorPagamento(valorPrestacao, diasAtrasos);

         qntdPrestacao++;
         valorTotal += valorPagamento = 1;


        }
        System.out.println("------------Relatorio Diário------------");
        System.out.println("Quantidade de prestações: " + qntdPrestacao);
        System.out.println("Valor total de prestações: R$ " + String.format("%.2f", valorTotal));
        System.out.println("----------------------------------------");


    
        
    }
    
     public static double valorPagamento(double valorPrestacao, int diasAtrasos) {
        if ( valorPrestacao > 0 & diasAtrasos >= 1) {

            double valorPagamento = valorPrestacao + (valorPrestacao * 0.03) + (0.001 * valorPrestacao * diasAtrasos);

            return valorPagamento;


        } else {
            
            double valorPagamento = valorPrestacao;
            
            return valorPagamento;


        
        }

        

     

        
        
        

    }
}
