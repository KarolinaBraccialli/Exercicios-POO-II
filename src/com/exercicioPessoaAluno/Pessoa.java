package com.exercicioPessoaAluno;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void mostraDados(){
        System.out.println("Nome da pessoa: " + this.getNome());
        System.out.println("Idade da pessoa: " + this.getIdade());
    }
}
