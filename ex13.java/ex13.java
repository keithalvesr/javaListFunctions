//Desenha moldura. 
//Construa uma função que desenhe um retângulo usando os caracteres
// ‘+’ , ‘−’ e ‘| ‘. Esta função deve receber dois parâmetros, linhas e colunas, 
//sendo que o valor por omissão é o valor mínimo igual a 1 e o valor máximo é 20. 
//Se valores fora da faixa forem informados, eles devem ser modificados para valores 
//dentro da faixa de forma elegante.

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de linhas do retangulo: [1-20] ");
        int linha = teclado.nextInt();
        System.out.print("Digite o número de colunas do retangulo: [1-20] ");
        int colunas = teclado.nextInt();

        teclado.close();

        if(linha > 20){
            
            linha = 20;

        } else if(linha < 1){

            linha = 1;
        }

        if(colunas > 20){

            colunas = 20;

        } else if(colunas < 1) {

            colunas = 1;
        }

        retangulo(linha, colunas);
        
    }

    public static void retangulo(int linha, int coluna) {

        System.out.print("+");

        for (int i = 0; i < linha; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < coluna; i++) {
            System.out.print("|");
            for (int j = 0; j < linha; j++) {
                System.out.print(" ");
            }
            System.out.println("|");

        }

        System.out.print("+");

        for (int i = 0; i < linha; i++) {
            System.out.print("-");
        }
        System.out.println("+");

    }   
        
}
    

