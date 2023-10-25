package org.lesson.java.eletronics;


public class Creator {


    public static Dispositivo create(String tipo) {
        if (tipo.equals("Playstation")) {
            return new Playstation();
        }
        if(tipo.equals("LettoreDVD")){
            return new LettoreDVD();
        }
        return null;
    }

}