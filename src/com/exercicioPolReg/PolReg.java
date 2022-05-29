package com.exercicioPolReg;

import java.util.Scanner;

public class PolReg {

    private int numeroLados;
    private double tamanhoLados;

    public double calculoArea(){
        return 0;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public double getTamanhoLados() {
        return tamanhoLados;
    }

    public void setTamanhoLados(double tamanhoLados) {
        this.tamanhoLados = tamanhoLados;
    }

    public PolReg(int numeroLados, double tamanhoLados) {
        this.numeroLados = numeroLados;
        this.tamanhoLados = tamanhoLados;
    }

    public double calculoPerimetro(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double soma =0;
        while (count < this.numeroLados){
            System.out.println("Tamanho do lado: ");
            this.tamanhoLados = scanner.nextDouble();
            soma+= this.tamanhoLados;
            count++;
        }
        return soma;
    }
}
