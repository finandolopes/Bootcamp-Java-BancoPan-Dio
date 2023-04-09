package Challenges;

/*
Desafio
O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
O gerente de uma loja de carros gostaria de um programa para calcular o
preço de um carro novo para os clientes. Você receberá o custo de fábrica
e as porcentagens referentes ao distribuidor e os impostos e deverá escrever
programa para ler esses valores e imprimir o valor final do carro.
*/

import java.util.Scanner;

public class FabricaDeCarros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Custo de Fábrica: ");
        int custoFabrica = scan.nextInt();
        System.out.println("Porcentagem do Distribuidor: ");
        int porcentagemDistribuidor = scan.nextInt();
        System.out.println("Impostos: ");
        int PercentualImpostos = scan.nextInt();

        int custoConsumidor;
        int Distribuidor;
        int ValorImpostos;

        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        ValorImpostos = (custoFabrica * PercentualImpostos)/100;

        custoConsumidor = (custoFabrica + Distribuidor + ValorImpostos);

        System.out.println("Valor do Carro Novo: "+custoConsumidor);
    }
}
