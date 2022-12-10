import java.util.Scanner;

//Faça uma função que informe a quantidade de dígitos de um determinado número inteiro informado.

public class ex8 {
    public static void main(String[] args) {
        
        String numero;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        numero = teclado.nextLine();

        System.out.println("Quantidades de digítos informado: " + quantDigitos(numero));

        teclado.close();

        
    }

    public static int quantDigitos(String numero){

        return numero.length();

    }
    
}
