# Linguagem JAM

**Matéria:** Compiladores.

**Nome da linguagem:** JAM.

**Professoras:** Camile Bordini, Fabiana Frata.

**Alunos:** [Marcos Sousa](https://github.com/molsousa), [Angelo Vilani](https://github.com/AngelV-c).

---

Este repositório apresenta uma linguagem em desenvolvimento para a disciplina de Compiladores utilizando JavaCC em seu desenvolvimento

---

Com exceção de escopos, todas as expressões devem ser finalizadas com `;` para entrar na sintaxe. 

Para a etapa atual temos desenvolvido:

- inicialização de programa
- inclusão de biblioteca (comando `import` seguido de uma string literal)
- criação de função
- declaração de variável
- atribuição de valores
- expressões relacionais, aritméticas e lógicas
- laços
- condicionais
- retorno de função

Importante ressaltar, que, ainda em desenvolvimento, não temos a análise semântica em desenvolvimento.

## Tipos de dados

Todos os tipos abaixo podem ser usados para declaração de variável e definição de função. 

- `void`
- `integer`
- `character`
- `float`
- `double`
- `boolean`

## Palavras reservadas para condicionais e laços

- `while`
- `for`
- `do` (em combinação com while ao final do escopo)
- `if`
- `else`

## Operadores relacionais

- IGUAL → `==`
- DIFERENTE →`!=`
- MAIOR → `>`
- MENOR → `<`
- MAIOR IGUAL → `>=`
- MENOR IGUAL → `<=`
	
## Operadores lógicos

- AND → `&&`
- NOT → `!`
- OR → `||`

---

Para a execução da linguagem, é necessário compilar o arquivo `JAM.jj` utilizando o compilador do [JavaCC](https://javacc.github.io/javacc/) e após, executar normalmente o arquivo gerado com nome: `JAM.java`.

---