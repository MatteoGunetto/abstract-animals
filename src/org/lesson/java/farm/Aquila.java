package org.lesson.java.farm;

public class Aquila extends Animale implements Volante{
    public Aquila(String nome) {
        super(nome);
    }

    @Override
    void verso() {
        System.out.println("hawwwww");
    }

    @Override
    void mangia() {
        System.out.println(super.getNome() + " mangia serpentelli.");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}