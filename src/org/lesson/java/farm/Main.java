package org.lesson.java.farm;

public class Main {
    public static void main(String[] args) {
        Volante rey = new Aquila("rey");
        Nuotatore flipper = new Delfino("flipper");
        Volante cici = new Passerotto("cici");

        faiVolare(rey);
        faiVolare(cici);
        faiNuotare(flipper);
    }
    private static void faiVolare(Volante animale){
        animale.vola();
    }
    private static void faiNuotare(Nuotatore animale){
        animale.nuota();
    }
}