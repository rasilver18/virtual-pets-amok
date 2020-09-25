package main.java;

import main.java.Litterbox;
import main.java.OrganicCat;
import main.java.RoboticPet;

public class RoboticCat extends RoboticPet implements Litterbox {
    public RoboticCat(String petName, String petType, String petDescription, int happinessLevelLevel, int healthLevel, int funLevel, int oilLevel, int bathroomLevel) {
        super(petName, petType, petDescription, happinessLevelLevel, healthLevel, funLevel, oilLevel, bathroomLevel);
    }



    @Override
    public void cleanLitterbox() {
        decreaseBathroomLevel(5);
        decreaseHappinessLevel(2);
        decreaseHeatlhLevel(3);
    }


}

