//Faça um programa, com uma função que necessite de um argumento. 
//A função retorna o valor de caractere ‘P’, se seu argumento for positivo, 
//e ‘N’, se seu argumento for zero ou negativo.
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {

        double numero;
        

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número: ");

        numero = teclado.nextDouble();

        System.out.println(resultado(numero));

        teclado.close();



        
    }

    
    public static String resultado(double numero) {
        if(numero > 0) {
            return "P";
            
        }else {
            return "N";

        }
        
    }
    
}
