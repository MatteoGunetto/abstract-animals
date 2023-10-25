package org.lesson.java.eletronics;

public class Main {
    public static void main(String[] args) {

        Dispositivo playPlayStation = Creator.create("Playstation");
        playPlayStation.play();
        playPlayStation.stop();

        Dispositivo playDVD = Creator.create("LettoreDVD");
        playDVD.play();
        playDVD.stop();
    }
}