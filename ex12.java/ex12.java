import java.util.Scanner;

//Embaralha palavra. 
//Construa uma função que receba uma string como parâmetro 
//e devolva outra string com os carateres embaralhados. 
//Por exemplo: se função receber a palavra python, pode retornar npthyo, 
//ophtyn ou qualquer outra combinação possível, de forma aleatória. 
//Padronize em sua função que todos os caracteres serão devolvidos 
//em caixa alta ou caixa baixa, independentemente de como foram digitados.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) throws Exception {

        String PalavraEmb = "";
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo ao programa que embaralha palavras! ");
        System.out.print("Digite uma palavra: ");
        String palavra = teclado.nextLine();
        
        teclado.close();

        String[] arrayString = palavra.split("");

        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(arrayString));

        Collections.shuffle(strList);
        
        for(String letter : strList){
            PalavraEmb += letter.toUpperCase();
        }
        
        System.out.println(PalavraEmb);
    }

    public static int rand(int min, int max) {
       int randomNum = (int) Math.floor(Math.random() * (max - min + 1)) + min;
       return randomNum;
    }
}
    

