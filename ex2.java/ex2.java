// Faça um programa para imprimir:
//    1
//    1   2
//    1   2   3
//    .....
//    1   2   3   ...  n
// para um n informado pelo usuário. Use uma função que receba um valor n inteiro
// imprima até a n-ésima linha.

public class ex2 {
    public static void main(String[] args) {
        
        int n = 5;
        int i, j;

        for(i=1; i <= n; i++) {
           for(j=1; j<i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    
}}
