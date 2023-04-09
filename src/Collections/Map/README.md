<h1>Map</h1>

<p>Elementos únicos (key) para cada valor (value)</p>
<p>Essa interface é um objeto que mapeia valores para chaves, 
ou seja, através da chave consegue ser acessado o valor configurado,
sendo que a chave não pode ser repetida ao contrário do valor, mas 
se caso tiver uma chave repetida é sobrescrito pela última chamada. 
Também faz parte do pacote java.util e não possui métodos da interface 
Collection.</p>

<p><b>Sintaxe:</b></p>

Map<E> mapa = new Type();

E - é o objeto declarado, podendo ser classes Wrappers ou tipo de coleção.
Type - é o tipo de objeto da coleção a ser usado.

<p><b>Classes:</b></p>
<p>Hashtable</p>
<p>HashMap</p>
<p>LinkedHashMap</p>
<p>TreeMap</p>


<h2>HashTable</h2>
<p>Essa classe trabalha com algoritmo hash para conversão das chaves e um
mecanismo de pesquisa de valores, sendo que tem seus métodos sincronizados
(thread-safe) que permitem checar acessos concorrentes e armazenagem.
Também possui uma eficiente pesquisa de elementos baseados em chave-valor,
mas não aceita valores nulos.</p>

<h2>HashMap</h2>
<p><b>Características:</b></p>
<p>Os elementos não são ordenados;</p>
<p>É rápida na busca/inserção de dados;</p>
<p>Permite inserir valore e chaves nulas;</p>

<p><b>Métodos úteis</b></p>

Esses métodos oferece bastante ajuda quando é trabalhado com a interface Map.

<p><b>values() -</b> É uma Collection com todos os valores que foram associados
a alguma das chaves.</p>
<p><b>keySet() -</b> Retorna um Set com as chaves do mapa especificado.</p>
<p><b>entrySet() -</b> Retorna um conjunto de Maps contido no mapa configurado, podendo ser possível 
acessar suas chaves e valores.</p>
<p><b>put (Key key, Value value) -</b> Associa um valor a uma chave específica.</p>


