package Challenges;

import java.util.Scanner;

/*
Desafio
Leia 6 valores. Em seguida, mostre quantos destes valores digitados
foram positivos. Na próxima linha, deve-se mostrar a média de todos
os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ( int ) ou
de ponto flutuante ( float ou double ). Pelo menos um destes números
será positivo.
*/
public class ImprimindoPositivosEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x;
        double variavel = 0;

        System.out.println("Escreva 6 números:");
        for (int i = 0; i<6; i++) {
            x = scan.nextDouble();
            if(x>=0){
                cont++;
                variavel = variavel + x;
            }
        }

        media = variavel / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}
