
# Java Collections Framework

O Java Collections Framework surgiu a partir da versão 1.2 do Java com a finalidade de 
resolver dificuldades de implementação de estruturas de dados utilizando arrays. 
Para isso foram desenvolvidas classes que implementassem estuturas como listas ligadas 
e tabelas de espalhamento (*hash*).

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


## Descrição das interfaces

* `Collections`
    * Não existe implementação direta dessa interface;
    * Define as operações básicas para as coleções, como incluir, remover e alterar.

* `Set`
    * Assim como na teoria dos conjuntos, a interface `Set` define uma coleção que não permite elementos duplicados.

* `SortedSet`
    * Interface que estende `Set` e possibilita a ordenação dos elementos tanto por ornem numérica quanto alfabética.


## implementação

As implementações de cada interface podem ser resumidas na tabela a seguir.

