
//Quadrado mágico.
// Um quadrado mágico é aquele dividido em linhas e colunas, com um número em cada posição 
//e no qual a soma das linhas, colunas e diagonais é a mesma. 
//Por exemplo, veja um quadrado mágico de lado 3, com números de 1 a 9:

//8  3  4 
//1  5  9
//6  7  2
//Elabore uma função que identifica e mostra na tela todos os quadrados mágicos 
//com as características acima. 
//Dica: produza todas as combinações possíveis e verifique a soma quando completar cada quadrado. 
//Usar um vetor de 1 a 9 parece ser mais simples que usar uma matriz 3x3.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GeradorDeQuadradoAleatorio {

    private static final Random gerador = new Random();

    public static ArrayList<Integer> gerarQuadrado() {
        return new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8));
    }

    public static int pegarNumeroAleatorio(ArrayList<Integer> quadrado) {
        return quadrado.remove(gerador.nextInt(quadrado.size())) + 1;
    }
}