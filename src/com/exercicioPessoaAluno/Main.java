package com.exercicioPessoaAluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva 'A' caso queira criar um novo aluno, ou 'P' caso queira criar uma pessoa");
        String novo = scanner.next();

        if (novo.equalsIgnoreCase("a")){
            System.out.println("Digite o nome do aluno: ");
            String nome = scanner.next();
            System.out.println("Digite  idade do aluno: ");
            int idade = scanner.nextInt();
            System.out.println("Digite o curso do aluno: ");
            String curso = scanner.next();
            Aluno aluno = new Aluno(nome, idade, curso);
            aluno.mostraDados();
        } else{
            System.out.println("Digite o nome da pessoa: ");
            String nome = scanner.next();
            System.out.println("Digite  idade da pessoa: ");
            int idade = scanner.nextInt();
            Pessoa pessoa = new Pessoa(nome, idade);
            pessoa.mostraDados();
        }
    }
}
