package com.exercicioPolReg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tipo de objeto a ser criado?");
        System.out.println("Digite 'p' para Polígono regular; 't' para Triangulo equilátero ou 'q' para Quadrado: ");
        String objeto = scanner.next();

       if (objeto.equalsIgnoreCase("p")){
           System.out.println("Informe o número de lados: ");
           int numeroLados = scanner.nextInt();
           PolReg polig = new PolReg(numeroLados,0);
           polig.setTamanhoLados();
           System.out.println("O perímetro é: " + polig.calculoPerimetro());
       } else if (objeto.equalsIgnoreCase("t")) {
           System.out.println("Informe o tamanho dos lados: ");
           int tamanhoLados = scanner.nextInt();
           TriangEquil triangulo = new TriangEquil(3, tamanhoLados);
           System.out.println("A área é: " + triangulo.calculoArea());
       } else if (objeto.equalsIgnoreCase("q")){
            System.out.println("Informe o tamanho dos lados: ");
            int tamanhoLados = scanner.nextInt();
            Quadrado quadrado = new Quadrado(4, tamanhoLados);
            System.out.println("A área é: " + quadrado.calculoArea());
        } else System.out.println("Opção inválida.");

    }
}
