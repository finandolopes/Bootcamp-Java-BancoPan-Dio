<h1>List</h1>

<p>Elementos duplicados e garante ordem de inserção.</p>
<p><b>Declarando - </b>
 List<String> linguagens = new ArrayList<String>(); </p>

<p><b>Métodos:</b></p>
linguagens.add("Java"); //Adiciona a linguagens

linguagens.contains("Java"); //Verifica se na lista contém a linguagem Java

linguagens.size(); //Retorna a quantidade de elementos da lista

linguagens.indexOf("Java"); //Retorna o indice onde o elemento 'Java' foi armazenado -> 0

linguagens.clear(); //Limpa a lista


ArrayList (implementação) - deve ser usado aonde mais operações de pesquisa ssão necessárias

LinkedList - dever ser uado onde mais operações de inserção e exclusão são necessárias
Vector - Threads


<h2>Exercícios Propostos</h2> 

1. Faça um programa que receba a temperatura média dos 6 primeiros meses do ano
   e armazene-as em uma lista.
   Após isto, calcule a média semestral das temperaturas e mostre todas as
   temperatura acima desta média, e em que mês elas ocorreram (mostras o mês por
   extenso: 1 - Janeiro, 2 - Fevereiro e etc).

2. Utilizando listas, faça um programa que faça 5 perguntas para uma pessoas sobre
   para uma pessoa sobre um crime. As perguntas são: 
   - "Telefonou para a vítima? "
   - "Esteve no local do crime? "
   - "Mora perto da vítima? "
   - "Devia para a vítima? "
   - "Já trabalhou com a vítima? "
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", 
entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado 
como "Inocente".