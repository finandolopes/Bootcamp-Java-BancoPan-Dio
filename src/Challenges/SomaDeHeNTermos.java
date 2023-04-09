package Challenges;

import java.util.Scanner;

/*
Desafio
Neste desafio, faça um programa que calcule o valor de H com N termos.

Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
 */
public class SomaDeHeNTermos {
    public static void main(String[] args) {

      double h = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite um número: ");
      double n = sc.nextDouble();

      for (int i = 1; i <= n; i++) {
       h += 1d/i;
       }
       System.out.println(Math.round(h));
    }
}
