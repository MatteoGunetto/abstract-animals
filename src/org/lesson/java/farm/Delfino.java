package org.lesson.java.farm;

public class Delfino extends Animale  implements Nuotatore{
    public Delfino(String nome) {
        super(nome);
    }

    @Override
    void verso() {
        System.out.println("hiiiii hiiiii");
    }

    @Override
    public void mangia() {
        System.out.println(super.getNome() + " mangia i pesci.");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}