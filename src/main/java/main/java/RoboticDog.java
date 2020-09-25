package main.java;

public class RoboticDog extends RoboticPet implements Walkies{
    public RoboticDog(String petName, String petType, String petDescription, int happinessLevelLevel, int healthLevel, int funLevel, int oilLevel, int bathroomLevel) {
        super(petName,petType, petDescription, happinessLevelLevel, healthLevel, funLevel, oilLevel, bathroomLevel);
    }

    @Override
    public void walkTheDoggies() {
        play();
        decreaseHappinessLevel(2);
        decreaseHeatlhLevel(1);

    }
}
