package org.lesson.java.eletronics;

public class Playstation extends Creator implements Dispositivo {

    @Override
    public void play() {
        System.out.println("Sono una playstation e sono in modalità play.");
    }

    @Override
    public void stop() {
        System.out.println("Sono una playstation e sono in modalità stop.");
    }
}