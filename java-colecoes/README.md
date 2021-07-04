
# Java Collections Framework

O Java Collections Framework surgiu a partir da versão 1.2 do Java com a finalidade de 
resolver dificuldades de implementação de estruturas de dados utilizando arrays. 
Para isso foram desenvolvidas classes que implementassem estuturas como listas ligadas 
e tabelas de espalhamento (*hash*).

## Colaboradores

* [Lucas Labre](https://github.com/lucaslabre)

## Hierarquia de interfacess e classes

A imagem a seguir mostra a hierarquia das interfaces e classes da Java Collections Framework.
Os retângulos verdes representam interfaces a serem implementadas e os retângulos
cinzas são as classes com os algoritmos. 
As linhas cheias representam `extends`, enquanto que as linhas pontilhadas representam
`implements`.

![Hierarquia-Collections](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20200811210521/Collection-Framework-1.png)

Além disso, existe uma segunda árvore independente que não é derivada de `Collections`, 
mas podem ser manipuladas como tal, são as classes e interfaces relacionadas a **mapas**,
chamadas de `Maps`.

![Hierarquia-Maps](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20200811210611/Collection-Framework-2.png)

## Descrição das classes da interface Set
### Características em comum
* Não permitem itens duplicados;
* Não é possível alterar a ordem dos elementos inseridos;
* Não é possível buscar um elemento pelo índice;
* Permitem navegação por `for`, `while` e `Iterator`.

### `HashSet`

* É a implementação padrão da interface `Set`;
* Os elementos inseridos não obedecem uma ordem;

### `LinkedHashSet`

* Extende a classe `HashSet`, então possui todos os métodos de `HashSet`;
* Os elementos são armazenados na posição em que são inseridos;

### `TreeHashSet`

* Implementa a interface SortedSet, então seus elementos são ordenados;
    * Caso os elementos sejam numéricos, serão inseridos em ordem crescente;
    * Caso os elementos sejam Strings, serão inseridos em ordem alfabética;
    * Caso os elementos sejam Objetos, será necessária a implementação da interface `Comparable<Object>` e implementação do método `CompareTo(Object)`.


## Complexidade dos algoritmos


HashSet             |     TreeSet     |     LinkedHashSet
:-------------------------:|:-------------------------:|:-------------
![](https://latex.codecogs.com/gif.latex?O%281%29)|![](https://latex.codecogs.com/gif.latex?O%28%5Clog%28n%29%29)|![](https://latex.codecogs.com/gif.latex?O%281%29)



![Grafico-complexidades](https://miro.medium.com/max/1300/1*6mpaXFsrRPFXSKXK5Qgm8w.png)