
        //Faça um programa para imprimir:
        //1
        //2   2
        //3   3   3
        //.....
        //n   n   n   n   n   n  ... n
        //para um n informado pelo usuário. Use uma função que receba um valor n inteiro 
        //e imprima até a n-ésima linha
public class ex1 {
    public static void main(String[] args) {

        int n = 5;
        int i, j;
        for(i=1; i <= n; i++) {
           for(j=0; j<i; j++) {
                System.out.print(i+" ");

            }
            System.out.println(" ");

        }

        



        
            
        }

    
}

