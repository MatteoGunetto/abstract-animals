package org.lesson.java.farm;



public class Cane extends Animale  {
    public Cane(String nome) {
        super(nome);
    }

    public void verso(){
        System.out.println("Grrr");
    }

    @Override
    void mangia() {
        System.out.println(super.getNome() + " mangia la croccantini.");
    }

}