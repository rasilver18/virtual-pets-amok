package main;

import main.java.Litterbox;
import main.java.OrganicCat;
import main.java.RoboticPet;

public class RoboticCat extends RoboticPet implements Litterbox {
    public RoboticCat(String petName, String petDescription, int happinessLevelLevel, int healthLevel, int funLevel, int oilLevel) {
        super(petName, petDescription, happinessLevelLevel, healthLevel, funLevel, oilLevel);
    }



    @Override
    public void cleanLitterbox(OrganicCat RoboticCat) {
        pottyTime();
    }
}