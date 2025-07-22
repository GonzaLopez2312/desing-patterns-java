package com.packages.Singleton;

public class Conection {

    private static Conection instance;

    private Conection() {}

    public static Conection getInstance() {
        if (instance == null) {
            instance = new Conection();
        }
        return instance;
    }
}
