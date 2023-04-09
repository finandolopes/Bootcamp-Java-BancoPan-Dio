package Collections.Set;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
public class ExercicioProposto1 {
    public static void main(String[] args) {
        Set<String> arcoIris = new HashSet<>();
        arcoIris.add("vermelha");
        arcoIris.add("laranja");
        arcoIris.add("amarela");
        arcoIris.add("verde");
        arcoIris.add("azul");
        arcoIris.add("azul-escuro");
        arcoIris.add("violeta");

        arcoIris.forEach(a -> System.out.print(a + "\n"));

        System.out.println("Quantidade de cores: "+ arcoIris.size());

        Set<String> coresArcoIris = new TreeSet<>(arcoIris);
        System.out.println("Cores (Ordem Alfabética): " + coresArcoIris);

        Set<String> coresInversa = new LinkedHashSet<>(arcoIris);
        System.out.println("Cores (Ordem Inversa): "+ coresInversa);

        System.out.print("Cores que começam com 'v': ");
        for(String cor: arcoIris){
            if(cor.startsWith("v")) System.out.print(cor+ ",");
        }

        Iterator<String> iterator = arcoIris.iterator();
        while (iterator.hasNext()){
            if(!iterator.next().startsWith("v"))
                iterator.remove();
        }
        System.out.println(" ");
        System.out.println("Removendo cores que começam com 'v': " + arcoIris);

        System.out.println("Limpando a lista de Cores");
        arcoIris.clear();

        System.out.println("Verificando se está vazia? " + arcoIris.isEmpty());
    }
}
