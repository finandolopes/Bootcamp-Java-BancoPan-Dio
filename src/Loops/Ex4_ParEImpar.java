package Loops;

/*
Faça um programa que peça N números inteiros, calcule e mostre
a quantiadade de números pares e a quantidade de números pares
e a quantidade de números impares.
 */

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares=0, quantImpares = 0;

        System.out.println("Quantidade de Números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if(numero % 2 == 0 ) {
                quantPares++;
            } else quantImpares++;
            count++;
        } while (count < quantNumeros);
        System.out.println("Numeros Pares: "+ quantPares);
        System.out.println("Numeros Impares: "+ quantImpares);
    }
}
