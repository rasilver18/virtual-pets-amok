package main.java;

public class OrganicDog extends OrganicPet implements Walkies {
    int cageCleanliness =10;
    public OrganicDog(String petName, String petType, String petDescription, int happinessLevelLevel, int healthLevel, int funLevel, int hungerLevel, int bathroomLevel, int thirstLevel) {
        super(petName, petType, petDescription, happinessLevelLevel, healthLevel, funLevel, hungerLevel, bathroomLevel, thirstLevel);
    }

    @Override
    public void walkTheDoggies() {
        play();
        decreaseBathroomLevel(5);
        decreaseHeatlhLevel(2);
        decreaseHappinessLevel(3);
        cageCleanliness = 0;


    }
    public void tickDog(){
        increaseHappinessLevel(4);
        increaseHealthLevel(3);
        cageCleanliness++;
        checkCage();
    }
    public void checkCage(){
        if (cageCleanliness ==15){
            System.out.println("We're about to soil our cage, please walk us ASAP");
        }
        else if(cageCleanliness ==25){
            System.out.println("Our cages are too dirty, goodbye");
            System.exit(0);
        }

    }

}
