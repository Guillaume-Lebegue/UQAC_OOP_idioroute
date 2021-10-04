package com.ikkino.idioroute.highway;

import java.util.List;
import java.util.Random;

public class HighwayBuilder {

    private Highway[] createAllHighways(int nbOfHighways) {
        Highway highways[] = new Highway[nbOfHighways + 1];
        float radius = 200;

        for (int i = 0; i < nbOfHighways; i++) {
            highways[i] = new Highway(radius, new Asphalte());
            radius -= radius / nbOfHighways;
        }
        return highways;
    }

    private Interchange[] createInterchanges(int nbOfInterchanges) {
        Interchange inters[] = new Interchange[nbOfInterchanges];

        for (int i = 0; i < nbOfInterchanges - 1; i++) {
            inters[i] = new Interchange();
        }
        return inters;
    }

    private void setInterchangesHighways(Highway highwayUp, Highway highway, Highway highwayDown, Interchange[] intersUp, Interchange[] intersDown) {
        int arraySize = intersUp.length + intersDown.length;
        float angleChange = 360 / arraySize;
        int biggestArray = intersUp.length > intersDown.length ? intersUp.length : intersDown.length;

        for (int i = 0; i < biggestArray; i++) {
            if (i % 2 == 0 && i < intersUp.length) {
                intersUp[i].setPosition(angleChange * (i * 2));
                intersUp[i].setInterchangeUp(highwayUp);
                intersUp[i].setInterchangeDown(highway);
            } else {
                intersDown[i].setPosition(angleChange * (i * 2 + 1));
                intersDown[i].setInterchangeUp(highway);
                intersDown[i].setInterchangeDown(highwayDown);
            }
        }
    }

    public Highway createHighway(int nbOfHighways) {
        Highway highways[] = createAllHighways(nbOfHighways);
        Interchange lastInters[] = null;
        Random rand = new Random();

        for (int i = 0; i < nbOfHighways; i++) {
            Interchange intersUp[] = createInterchanges(rand.nextInt((3 - 1) + 1) + 1);
            Interchange intersDown[] = createInterchanges(rand.nextInt((3 - 1) + 1) + 1);
            if (i == 0) {
                setInterchangesHighways(null, highways[i], highways[i + 1], intersUp, intersDown);
            } else if (i == nbOfHighways - 1) {
                setInterchangesHighways(highways[i - 1], highways[i], null, intersUp, intersDown);
            } else {
                setInterchangesHighways(highways[i - 1], highways[i], highways[i + 1], intersUp, intersDown);
            }
        }
        return highways[0];
    }
}
