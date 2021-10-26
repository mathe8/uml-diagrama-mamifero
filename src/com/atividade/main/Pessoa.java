package com.atividade.main;

public class Pessoa extends Mamifero{

    private Gato bichoEstimacao;

    public Pessoa(Integer peso, Boolean sexo){
        super(peso, sexo);
    }

    public void adotarBichoEstimacao(Integer peso, Boolean sexo){
        this.bichoEstimacao = new Gato(peso, sexo);
    }

    public void falar(){
        System.out.println("Falando...");
    }

}
