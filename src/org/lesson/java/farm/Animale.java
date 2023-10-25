package org.lesson.java.farm;

public abstract class Animale {

    private String nome;

    public Animale(String nome) {
        this.nome = nome;
    }
    public void dormi() {
        System.out.println("Zzz");
    }

    abstract void verso();

    abstract void mangia();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

