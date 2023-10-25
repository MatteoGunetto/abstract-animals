package org.lesson.java.farm;

public class Passerotto extends Animale  implements Volante{
    public Passerotto(String nome) {
        super(nome);
    }

    @Override
    void verso() {
        System.out.println("Cip Cip");
    }

    @Override
    void mangia() {
        System.out.println(super.getNome() + " mangia insetti.");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}