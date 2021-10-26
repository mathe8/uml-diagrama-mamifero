package com.atividade.main;

public class Mamifero extends Animal{

    private Mamifero pai;
    private Mamifero mae;
    private Coracao coracao;
    final private Boolean sexo;

    public Mamifero(Integer peso, Boolean sexo){
        super(peso);
        this.sexo = sexo;
        this.coracao = new Coracao();
    }

    public void informarSexo(){
        if (this.sexo){
            System.out.println("Feminino");
        } else {
            System.out.println("Masculino");
        }
    }

    public void comer(){
        System.out.println("Comendo...");
    }

}
