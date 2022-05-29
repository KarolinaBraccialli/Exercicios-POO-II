package com.exercicioPolReg;

public class TriangEquil extends PolReg{
    public TriangEquil(int numeroLados, double tamanhoLados) {
        super(numeroLados, tamanhoLados);
    }


    public double calculoArea(){
        return this.getNumeroLados()*this.getTamanhoLados();
    }
}
