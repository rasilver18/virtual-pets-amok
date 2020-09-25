package main.java;

public abstract class OrganicPet extends VirtualPet{
    protected int hungerLevel;
    protected int thirstLevel;

    public OrganicPet (String petName, String petType, String petDescription, int happinessLevelLevel, int healthLevel, int funLevel, int hungerLevel, int bathroomLevel, int thirstLevel) {
        super(petName, petType, petDescription, happinessLevelLevel, healthLevel, funLevel, bathroomLevel);
        this.hungerLevel=hungerLevel;
        this.thirstLevel=thirstLevel;
    }

    public int getHunger() {
        return hungerLevel;
    }
    public int getThirst() { return thirstLevel; }



    public void feed() {
        hungerLevel = 0;
        increaseBathroomLevel(1);


    }




    public void water(){
        thirstLevel = 0;
        increaseBathroomLevel(3);
    }
    public void orgoTick(){
        thirstLevel ++;
        hungerLevel ++;
    }
    @Override
    public String toString(){
     return String.format("%-10s %10s %15s %10d %10d %10d %10d %10d %10d", petName, petType, petDescription, happinessLevel, healthLevel, bathroomLevel, funLevel, hungerLevel, thirstLevel);
       // return String.format("%-10s", petName, hungerLevel);
    }


}
