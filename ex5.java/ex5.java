//Faça um programa com uma função chamada somaImposto. 
//A função possui dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas 
//expressa em porcentagem e custo, que é o custo de um item antes do imposto. A função “altera” 
//o valor de custo para incluir o imposto sobre vendas.
import java.util.Scanner;
public class ex5 {
 public static void main(String[] args) {
    
    Double taxaImposto, custo;
    taxaImposto = 0.15;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe o custo do item: ");
    custo = teclado.nextDouble();
    System.out.println("Valor imposto sobre custo: " + somaImposto(taxaImposto, custo));
    teclado.close();

    


 }
    public static double somaImposto(double taxaImposto, double custo) {

        double somaImposto = (custo * taxaImposto) + custo;

        return somaImposto;
    

    }
}
