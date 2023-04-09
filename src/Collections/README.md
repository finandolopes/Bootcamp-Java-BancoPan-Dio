<h1>Collections</h1>

<img src="../../assets/Collections.png" align="right" />

<p>Collections Framework é um conjunto bem definido de interfaces e classes para 
representar e tratar grupos de dados como uma única unidade, que pode ser chamada 
coleção, ou collection.</p>


<h2>Interfaces</h2>

<p>Interfaces são tipos abstratos que representam as coleções. Permitem que coleções 
sejam manipuladas tendo como base o conceito “Programar para interfaces e não para 
implementações”, desde que o acesso aos objetos se restrinja apenas ao uso de métodos
definidos nas interfaces.</p>

<h3>Set</h3>
<b>java.util.Set</b>
<p>Interface que define uma coleção que não permite elementos duplicados.</p>
E ordena de forma alfabetica

<h3>List</h3>
<b>java.util.List</b>
<p>Define uma coleção ordenada, podendo conter elementos duplicados. 
Em geral, o usuário tem controle total sobre a posição onde cada elemento 
é inserido e pode recuperá-los através de seus índices. Prefira esta interface 
quando precisar de acesso aleatório, através do índice do elemento.</p>

<h3>Queue</h3> 
<p>Um tipo de coleção para manter uma lista de prioridades, onde a ordem dos seus 
elementos, definida pela implementação de Comparable ou Comparator, determina essa 
prioridade. Com a interface fila pode-se criar filas e pilhas.</p>

<h3>Map</h3>
<p><b>java.util.Map</b></p>
<p>Mapeia chaves para valores. Cada elemento tem na verdade dois objetos: uma
chave e um valor.</p> 
<p>Importante lembrar que a interface Map não são derivadas de Collection</p>
<p>Elementos únicos, apenas uma chave(key) para cada valor(value)</p>
é possivel ordernar map pelo valor

---

ordem de performance das implementações da interface Set 
HashSet > LinkedHashSet > treeset

O que é uma coleção na linguagem Java ?
é um objeto que agrupa múltiplos elementos (Variaves primitivos ou objetod) dentro de uma unica unidade

Qual é a função da operação map()?
Converter cada elemento recebido em um outro objeto, de acordo com a função passada.

Dada a lista List<String> numeros = List.of("1","2","5","3"),
como fazemos para exibir no console a média dessa lista ?
System.out.print(numeros.stream().mapToInt(Integer::parseInt).average());