// Faça um programa, com uma função que necessite de três argumentos, 
// e que forneça a soma desses três argumentos.

public class ex3 {
    public static void main(String[] args) {
        int resultadoSoma = calculaSoma(1, 5, 6);
        System.out.println("A soma é: " + resultadoSoma);
    }

    public static int calculaSoma(int num1, int num2, int num3) {
        int soma = num1 + num2 + num3;
        return soma;
    }
}