package com.exercicioPolReg;

public class Quadrado extends PolReg{
    public Quadrado(int numeroLados, double tamanhoLados) {
        super(numeroLados, tamanhoLados);
    }

    public double calculoArea(){
        return this.getNumeroLados()*this.getTamanhoLados();
    }
}
