//Data com mês por extenso. 
//Construa uma função que receba uma data no formato DD/MM/AAAA 
//e devolva uma string no formato D de mesPorExtenso de AAAA. 
//Opcionalmente, valide a data e retorne NULL caso a data seja inválida.

import java.util.Arrays;
import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma data: [DD/MM/AAAA] ");
        String date = teclado.nextLine();
        teclado.close();
        System.out.println(convertDate(date));
        
    }
    
    public static String convertDate(String dateCompleted) {

        String[] months = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "junho", "Julho", "Agosto", "Setembro", "Outobro", "Novembro", "Dezembro" };

        // transforma em array separando após a /, ex: ["data", "mês", "ano"]
        String[] arrayDate = dateCompleted.split("/");

        // transforma o index do mês em int 
        int indexMonth = Integer.parseInt(arrayDate[1]);

        // transforma o mês por mês em extenso
        arrayDate[1] = months[indexMonth -1];

        // Transforma em string e substitui as barras por "de"
        String dateFormat = String.join(" de ", arrayDate);
        return dateFormat;
    }

    
}
