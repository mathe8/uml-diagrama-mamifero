package com.atividade.main;

public class Cachorro extends Mamifero {

    public Cachorro(Integer peso, Boolean sexo){
        super(peso, sexo);
    }

    public void latir(){
        System.out.println("Latindo...");
    }

}
