package main.java;
public class VirtualPet {
    private int hungerLevel = 10;
    private int thirstLevel = 10;
    private int funLevel = 10;
    private int  bathroomLevel = 10;
    private String petName;
    private String petDescription;


    public VirtualPet(String petName, String petDescription, int hungerLevel, int thirstLevel, int funLevel, int bathroomLevel) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.funLevel = funLevel;
        this.bathroomLevel = bathroomLevel;
    }


    public int getHunger() {
        return hungerLevel;
    }

    public void feed() {
        hungerLevel = 0;
        bathroomLevel++;


    }


    public int getThirst() {
        return thirstLevel;


    }
    public void water(){
        thirstLevel = 0;
        bathroomLevel ++;
    }

    public int getFun() {
        return funLevel;
    }

    public void play() {
        funLevel = 0;
        thirstLevel ++;
        hungerLevel++;
        bathroomLevel --;
    }




    public int getHygiene() {
        return bathroomLevel;
    }

    public void pottyTime() {
        bathroomLevel = 0;

    }


    public void tick() {
        checkHunger();
        checkBathroom();
        funLevel++;
        bathroomLevel ++;


    }

    private void checkHunger() {
        if (hungerLevel == 20) {
            System.out.println("Remember to feed the pets on your shift! ");
        }
        else if (hungerLevel==30){
            System.out.println("You let me go hungry :(");
            System.exit(0);

        }
    }


    private void checkBathroom() {
        if (bathroomLevel == 20) {
            System.out.println("Remember to keep our cages clean so that people want to adopt us");
        }
        else if (bathroomLevel == 30){
            System.out.println("You did not clean our cages. You're fired!");
            System.exit(0);
        }
    }

    public String getName() {
        return petName;
    }

    public String getDescription() {
        return petDescription;
    }


}
