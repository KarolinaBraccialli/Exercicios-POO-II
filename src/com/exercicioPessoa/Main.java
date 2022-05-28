package com.exercicioPessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa albert = new Pessoa("Albert Einstein", 14,3,1879);
        Pessoa isaac = new Pessoa("Isaac Newton", 4, 1, 1643);

        albert.calcularIdade(28,5,2022);
        isaac.calcularIdade(28,5,2022);
        System.out.println(albert);
        System.out.println(isaac);

        PessoaLocalDate albertII = new PessoaLocalDate("Albert Einstein","14/03/1879");
        albertII.calcularIdade("28/05/2022");
        System.out.println(albertII);
    }
}
