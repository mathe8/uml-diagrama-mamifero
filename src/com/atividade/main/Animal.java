package com.atividade.main;

public class Animal {

    private Integer peso;

    public Animal(Integer peso){
        this.peso = peso;
    }

    public void informarPeso(){
        System.out.println(this.peso);
    }

    public void alterarPeso(Integer peso){
        this.peso = peso;
    }

    public void correr(){
        System.out.println("Correndo...");
    }

}
