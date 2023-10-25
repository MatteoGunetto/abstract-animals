package org.lesson.java.eletronics;

public class Main {
    public static void main(String[] args) {

        Dispositivo play2 = Creator.create("Playstation");
        play2.play();
        play2.stop();

        Dispositivo dvd = Creator.create("LettoreDVD");
        dvd.play();
        dvd.stop();
    }
}