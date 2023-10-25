package org.lesson.java.eletronics;


public class LettoreDVD extends Creator implements Dispositivo {

    @Override
    public void play() {
        System.out.println("Sono un lettoreDVD e sono in modalità play.");
    }

    @Override
    public void stop() {
        System.out.println("Sono un lettoreDVD e sono in modalità stop.");
    }
}