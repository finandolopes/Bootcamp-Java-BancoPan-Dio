package Loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 númeors e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int count = 0;
        int soma = 0;
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            count++;

            if(numero > maior) maior = numero;
            soma = soma + numero;


        } while (count < 5);
        System.out.println("Maior número:" + maior);
        System.out.println("Média: " + (soma/5));
    }


}
