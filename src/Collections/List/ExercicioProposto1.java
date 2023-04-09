package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que receba a temperatura média dos 6 primeiros meses do ano
e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as
temperatura acima desta média, e em que mês elas ocorreram (mostras o mês por
extenso: 1 - Janeiro, 2 - Fevereiro e etc).
*/
public class ExercicioProposto1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> temperatura = new ArrayList<Double>();

        int i = 1;
        do {
            System.out.print("Temperatura do Mês " + i + " : ");
            temperatura.add(scan.nextDouble());
            i++;
        } while (i <= 6);

        System.out.println("--------------------------");

        System.out.println("Temperaturas: ");
        temperatura.forEach(t -> System.out.print(t + " - "));
        System.out.println(" ");
        System.out.println("--------------------------");

        Iterator<Double> iterator = temperatura.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        Double media = (soma / temperatura.size());
        System.out.printf("Média das Temperaturas : %.1f\n ", media);

        System.out.println("--------------------------");

        System.out.print("Temperaturas acima da média: ");
        temperatura.stream().filter(t -> t > media).forEach(t -> System.out.printf("%.1f ", t));

        System.out.println("\n--------------------------");
        System.out.println("Meses das temperaturas acima da média: ");
        Iterator<Double> iterator1 = temperatura.iterator();
        int count = 0;
        while (iterator1.hasNext()) {
            Double temp = iterator1.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - Janeiro: %.1f\n", temp);
                        break;
                    case (1):
                        System.out.printf("2 - Fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - Março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - Abril: %.1f\n",temp);
                        break;
                    case (4):
                        System.out.printf("5 - Maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - Junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média");
                }
            }  count++;
        }
    }
}
