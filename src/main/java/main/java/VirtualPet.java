package main.java;
public abstract class VirtualPet {
    protected int funLevel;
    protected int happinessLevel =10;
    protected int  healthLevel;
    protected int bathroomLevel;
    protected String petName;
    protected String petDescription;
    protected String petType;


    public VirtualPet(String petName, String petType, String petDescription, int happinessLevelLevel, int healthLevel, int funLevel, int bathroomLevel) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petType=petType;
        this.happinessLevel= happinessLevel;
        this.healthLevel= healthLevel;
        this.funLevel = funLevel;
        this.bathroomLevel =bathroomLevel;

    }







    public int getFun() {
        return funLevel;
    }
    public int getHygiene() {
        return bathroomLevel;
    }
    public int getHappiness(){ return happinessLevel;}
    public int getHealth(){return happinessLevel;}
    public String getName() {
        return petName;
    }
    public String getDescription() {
        return petDescription;
    }
    public String getPetType(){return petType;}

    public void play() {
        funLevel = 0;
        happinessLevel --;
        healthLevel --;
        bathroomLevel --;
    }

    public void pottyTime(){
        bathroomLevel = 0;
        healthLevel --;
    }





    public void tick() {
        healthIsBad();
        funLevel++;
        bathroomLevel ++;
        healthLevel ++;
        happinessLevel ++;


    }
    public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;
    }


    public void decreaseHeatlhLevel(int healthDecreaseAmount){
        healthLevel -= healthDecreaseAmount;
    }
    public void increaseBathroomLevel(int bathroomIncreaseAmount) {

        bathroomLevel += bathroomIncreaseAmount;
    }


    public void decreaseBathroomLevel(int bathroomDecreaseAmount){
        bathroomLevel -= bathroomDecreaseAmount;
    }
    public void increaseHappinessLevel(int happinessIncreaseAmount) {

        happinessLevel+= happinessIncreaseAmount;
    }


    public void decreaseHappinessLevel(int happinessDecreaseAmount){
        happinessLevel -= happinessDecreaseAmount;
    }

    private void healthIsBad() {
        if (bathroomLevel == 30) {
            healthLevel = 40;
            System.out.println("Your pets are soiling their cages");
        }
        else if (bathroomLevel==40){
            healthLevel = 60;
            System.out.println("You have fully neglected your pets. You're fired.");
            System.exit(0);

        }
    }
    public abstract String toString();




}
