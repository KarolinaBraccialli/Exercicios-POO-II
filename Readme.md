## Exercícios de POO - ParteII

1- Criar a classe Pessoa com as seguintes características:
* atributos: idade e dia, mês e ano de nascimento, nome da pessoa
* métodos:
* calculaIdade(), que recebe a data atual em dias, mês e anos e calcula e
armazena no atributo idade a idade atual da pessoa
* informaIdade(), que retorna o valor da idade
* informaNome(), que retorna o nome da pessoa
* ajustaDataDeNascimento(), que recebe dia, mês e ano de nascimento
como parâmetros e preenche nos atributos correspondentes do objeto.
* Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido
em 14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643)
* Fazer uma classe principal que instancie os objetos, inicialize e mostre quais
seriam as idades de Einstein e Newton caso estivessem vivos.

2- Fazer uma classe Aluno que possua as seguintes características:
* dois atributos do tipo inteiro: primeira nota parcial (de 0 a 10) e Segunda
nota parcial (de 0 a 10)
* um atributo String representando o nome do aluno 
* possua métodos para ler e escrever os atributos (ou uma construtora)
* Fazer uma classe Controle que:
* pergunte ao usuário o nome e as duas notas parciais de um aluno. Caso o
nome entrado seja “fim” isso significa que o usuário não quer inserir mais
nenhum aluno, do contrário deve ser instanciado um objeto da classe Aluno e
armazenados os dados digitados.
Dicas: usar um objeto da classe ArrayList de Java para armazenar as
referências para os objetos instanciados). Usar o método equals da classe
String para verificar se o valor do nome entrado é igual a “fim”.
* Calcular, ao final da inserção de todos os alunos, a média da turma, quantos
alunos foram aprovados, quantos foram para a final e quantos foram
reprovados e mostrar os códigos de todos os alunos cujas notas ficaram abaixo
da média da turma.

3- Implementar a classe PolReg, que define um polígono regular
* Atributos: número de lados, tamanho do lado
* Métodos: cálculo do perímetro e cálculo de área.
Este último deve retornar o valor zero, dado que não é possível calcular a área
de um polígono regular genérico
* Construtora que inicializa os valores dos atributos
Fazer a classe TrianguloEqderivada de PolReg, que:
* redefine o método de cálculo de área para calcular e retornar a área do
triângulo equilátero
Fazer a classe Quadrado, também derivada de PolReg, que:
* redefine o método de cálculo de área para calcular e retornar a área do
quadrado

Fazer um programa que:
* pergunte ao usuário que tipo de objeto ele quer criar (polígono regular,
triângulo equilátero ou quadrado)
* pergunte número de lados (se for polígono regular) e tamanho dos lados
* instancie o objeto e mostre o valor do perímetro, ângulo interno e área
calculados.

4- Escrever a classe Pessoa com as seguintes características:
* atributos: nome e idade
* métodos: construtora para inicializar os parâmetros e mostraDados() que
exibe os dados da pessoa no console na forma:
Nome da pessoa: xxx
Idade da pessoa: yyy
Escrever a classe Aluno, derivada de Pessoa, com as seguintes características:
* atributos: nome do curso que está cursando
* métodos: construtora para inicializar os atributos e redefinição do método
mostraDados() para exibir as seguintes mensagens:
Nome do aluno: xxx
Idade do aluno: yyy
Curso do aluno: zzz
Elaborar um programa em Java que:
* declare uma referência para objeto da classe Pessoa
* pergunte ao usuário, via console, se ele deseja instanciar um aluno ou uma
pessoa
* crie o objeto correspondente, referencie com a referência já criada e chame
o método mostraDados() para exibir os dados da pessoa ou do aluno.