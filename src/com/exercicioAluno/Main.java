package com.exercicioAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        double mediaTurma = 0;
        Aluno aluno;

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.next();
        while (!nome.equalsIgnoreCase("fim")) {
            System.out.println("Digite a primeira nota: ");
            int nota1 = scanner.nextInt();
            System.out.println("Digite a segunda nota: ");
            int nota2 = scanner.nextInt();
            aluno = new Aluno(nome, nota1, nota2);
            aluno.calcularMedia();
            mediaTurma += aluno.getMedia();
            alunos.add(aluno);

            System.out.println("Digite o nome do aluno: ");
            nome = scanner.next();
        }

        mediaTurma = mediaTurma/alunos.size();
        System.out.println("A média da turma é: " + mediaTurma);

        int alunosAprovados =0;
        int alunosFinal =0;
        int alunosReprovados =0;

        for (Aluno el: alunos) {
           if (el.getMedia() >= 7){
               alunosAprovados++;
           } else if (el.getMedia() <7 && el.getMedia()>=5) {
               alunosFinal ++;
           } else {
               alunosReprovados++;
           }
            System.out.println("Alunos com notas abaixo da média: ");
           if (el.getMedia() < mediaTurma){
               System.out.println(el.getNome() +" "+ el.getMedia());
           }
        }

        System.out.println("Quantidade de alunos aprovados: " + alunosAprovados);
        System.out.println("Quantidade de alunos de exame: " + alunosFinal);
        System.out.println("Quantidade de alunos reprovados: " + alunosReprovados);

    }
}
