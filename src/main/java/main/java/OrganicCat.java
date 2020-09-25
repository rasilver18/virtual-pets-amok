package main.java;

public class OrganicCat extends OrganicPet implements Litterbox{

    public OrganicCat(String petName, String petType, String petDescription, int happinessLevelLevel, int healthLevel, int funLevel, int hungerLevel, int bathroomLevel, int thirstLevel) {
        super(petName, petType, petDescription, happinessLevelLevel, healthLevel, funLevel, hungerLevel, bathroomLevel, thirstLevel);
    }

  @Override
  public void cleanLitterbox() {
      decreaseBathroomLevel(5);
  }
    public void tickCats(){
        increaseBathroomLevel(3);
        increaseHappinessLevel(2);
        increaseHealthLevel(2);

    }

}
