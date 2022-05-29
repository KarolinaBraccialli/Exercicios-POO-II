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