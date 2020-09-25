package main.java;

public abstract class RoboticPet extends VirtualPet {
    protected int oilLevel =10;
    public RoboticPet(String petName, String petType, String petDescription, int happinessLevelLevel, int healthLevel, int funLevel, int oilLevel, int bathroomLevel) {
        super(petName, petType, petDescription, happinessLevelLevel, healthLevel, funLevel, bathroomLevel);
        this.oilLevel= oilLevel;
    }
    public int getOilLevel(){
        return oilLevel;
    }
    public void oilPet(){
        oilLevel = 0;
    }

    public void roboTick(){
        oilLevel ++;

    }
    @Override
    public String toString(){
        return String.format("%-10s %10s %15s %10d %10d %10d %10d %10d", petName, petType, petDescription, happinessLevel, healthLevel, bathroomLevel, funLevel, oilLevel);
    }

}
