package com.exercicioPessoaAluno;

public class Aluno extends Pessoa{
    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;

    }
    private String curso;

    public String getCurso() {
        return curso;
    }


    public void mostraDados(){
        System.out.println("Nome do aluno: " + this.getNome());
        System.out.println("Idade do aluno: " + this.getIdade());
        System.out.println("Curso do aluno: " + this.getCurso());
    }
}
