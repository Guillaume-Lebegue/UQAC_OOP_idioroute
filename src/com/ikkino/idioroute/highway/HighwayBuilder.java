package com.ikkino.idioroute.highway;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HighwayBuilder {

    private List<Highway> createAllHighways(int nbOfHighways) {
        List<Highway> highways = new ArrayList<>();
        float radius = 200;

        for (int i = 0; i < nbOfHighways; i++) {
            System.out.println("Creating highway: " + i + " with radius = " + radius);
            highways.add(new Highway(radius, new Asphalte(), i+1));
            radius -= radius / nbOfHighways;
        }
        return highways;
    }

    private List<Interchange> createInterchanges(int nbOfInterchanges) {
        List<Interchange> inters = new ArrayList<>();

        for (int i = 0; i < nbOfInterchanges; i++) {
            System.out.println("Creating interchange: " + i);
            inters.add(new Interchange());
        }
        return inters;
    }

    private void setInterchangesHighways(Highway highwayUp, Highway highway, Highway highwayDown, List<Interchange> intersUp, List<Interchange> intersDown) {
        int arraySize = intersUp.size() + intersDown.size();
        float angleChange = 360 / (float)arraySize;
        int biggestArray = Math.max(intersUp.size(), intersDown.size());
        List<Interchange> allInters = new ArrayList<>();

        System.out.println(arraySize + " Interchanges for " + angleChange + " angleChange");

        for (int i = 0; i < biggestArray; i++) {
            System.out.println("index: " + i + ", size InterUp: " + intersUp.size() + ", size interDown: " + intersDown.size());
            if (i < intersUp.size()) {
                System.out.println("Setting position of Interchange Up " + i + " to : " + angleChange * (i * 2));
                intersUp.get(i).setPosition(angleChange * (i * 2));
                intersUp.get(i).setInterchangeUp(highwayUp);
                intersUp.get(i).setInterchangeDown(highway);
                allInters.add(intersUp.get(i));
            }
            if (i < intersDown.size()) {
                System.out.println("Setting position of Interchange Down " + i + " to : " + angleChange * (i * 2 + 1));
                intersDown.get(i).setPosition(angleChange * (i * 2 + 1));
                intersDown.get(i).setInterchangeUp(highway);
                intersDown.get(i).setInterchangeDown(highwayDown);
                allInters.add(intersDown.get(i));
            }
        }
        highway.setAllInterchange(allInters);
    }

    public Highway createHighway(int nbOfHighways) {
        List<Highway>highways = createAllHighways(nbOfHighways);
        Random rand = new Random();

        for (int i = 0; i < nbOfHighways; i++) {
            System.out.println("For highway: " + i);
            List<Interchange> intersUp = createInterchanges(rand.nextInt((3 - 1) + 1) + 1);
            List<Interchange> intersDown = new ArrayList<>();
            if(i != nbOfHighways - 1)
                intersDown = createInterchanges(rand.nextInt((3 - 1) + 1) + 1);
            if (i == 0) {
                setInterchangesHighways(null, highways.get(i), highways.get(i + 1), intersUp, intersDown);
            } else if (i == nbOfHighways - 1) {
                setInterchangesHighways(highways.get(i - 1), highways.get(i), null, intersUp, intersDown);
            } else {
                setInterchangesHighways(highways.get(i - 1), highways.get(i), highways.get(i + 1), intersUp, intersDown);
            }
        }
        return highways.get(0);
    }
}
