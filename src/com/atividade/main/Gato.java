package com.atividade.main;

public class Gato extends Mamifero{

    public Gato(Integer peso, Boolean sexo){
        super(peso, sexo);
    }

    public void miar(){
        System.out.println("Miando...");
    }
}
