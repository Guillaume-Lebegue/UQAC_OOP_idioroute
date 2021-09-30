package com.ikkino.idioroute;

import com.ikkino.idioroute.highway.HighwayManager;

final public class Idioroute {
    public static void main(String[] args) {
        System.out.println("Hello world !");
        HighwayManager highwayManager = new HighwayManager();
        highwayManager.start();
    }
}
