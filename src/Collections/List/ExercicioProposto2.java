package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/
public class ExercicioProposto2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        int count=0;
        do {
            if(count == 0) System.out.println("Telefonou para a vítima?");
            else if(count == 1) System.out.println("Esteve no local do crime?");
            else if (count == 2) System.out.println("Mora perto da vítima?");
            else if (count == 3) System.out.println("Devia para a vítima?");
            else if (count == 4) System.out.println("Já trabalhou com a vítima?");
            respostas.add(scan.next());
        count++;
        } while(count < 5);

        System.out.println(respostas);

        Iterator<String> iterator = respostas.iterator();

        int count1 = 0;
        while (iterator.hasNext()){
            String res = iterator.next();
            if(res.contains("Sim") || res.contains("sim")){
               count1++;
            }
        }

        switch (count1){
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }
    }
}
