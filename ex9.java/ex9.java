//Reverso do número. Faça uma função que retorne o reverso de um número inteiro informado. 
//Por exemplo: 127 -> 721.

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        String numero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        numero = teclado.nextLine();

        teclado.close();

        System.out.println("O reverso desse número é: " + numeroReverso(numero));

        
    }
    
    public static String numeroReverso(String numero) {
        String reverso = "";

        for (int i = numero.length() - 1; i >= 0; i--) {
            reverso = reverso + numero.charAt(i);
        }

        return reverso;
    }
}
