package main.java;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {


    private Map<String, main.java.VirtualPet> theShelter = new HashMap<>();



    public Map<String, main.java.VirtualPet> getPets() {
        return theShelter;
    }

    public void intake (main.java.VirtualPet newShelterPet){
        theShelter.put(newShelterPet.getName(), newShelterPet);

    }
    public void adoptPet (String petName){
        theShelter.remove(petName);
    }
    public void feedShelterPets(){
        for (Map.Entry <String, main.java.VirtualPet> entry : theShelter.entrySet()){
            main.java.VirtualPet feedShelterPets= entry.getValue();
            feedShelterPets.feed();
        }
    }
    public void fillWaterBowls(){
        for (Map.Entry <String, main.java.VirtualPet> entry : theShelter.entrySet()){
            main.java.VirtualPet fillWaterBowls = entry.getValue();
            fillWaterBowls.water();
        }
    }

    public void cleanPoop(){
        for (Map.Entry <String, main.java.VirtualPet> entry : theShelter.entrySet()){
            main.java.VirtualPet cleanPoop = entry.getValue();
            cleanPoop.pottyTime();
        }
    }

    public void playWithAllPets(){for (Map.Entry <String, main.java.VirtualPet> entry : theShelter.entrySet()){
        main.java.VirtualPet playWithAllPets = entry.getValue();
        playWithAllPets.play();
    }}

    public void tickMethod(){for (Map.Entry <String, main.java.VirtualPet> entry : theShelter.entrySet()){
        main.java.VirtualPet tickMethod = entry.getValue();
        tickMethod.tick();
    }

    }



}
