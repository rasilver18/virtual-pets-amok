package main.java;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {


    public Map<String, main.java.VirtualPet> theShelter = new HashMap<>();


    public Map<String, main.java.VirtualPet> getPets() {
        return theShelter;
    }

    public void intake(main.java.VirtualPet newShelterPet) {
        theShelter.put(newShelterPet.getName(), newShelterPet);

    }

    public void adoptPet(String petName) {
        theShelter.remove(petName);
    }

    public void feedShelterPets() {
        for (VirtualPet allPets : theShelter.values()) {
            if (allPets instanceof OrganicPet) {
                ((OrganicPet) allPets).feed();
            }
        }
    }

    public void fillWaterBowls() {
        for (VirtualPet allPets : theShelter.values()) {
            if (allPets instanceof OrganicPet) {
                ((OrganicPet) allPets).water();
            }
        }
    }

    public void cleanPoop() {
        for (VirtualPet allPets : theShelter.values()) {
            ((VirtualPet) allPets).pottyTime();
        }
    }

    public void cleanAllLitterbox() {
        for (VirtualPet allPets : theShelter.values()) {
            if (allPets instanceof OrganicCat) {
                ((OrganicCat) allPets).cleanLitterbox();
            } else if (allPets instanceof RoboticCat) {
                ((RoboticCat) allPets).cleanLitterbox();
            }
        }
    }

    public void walkTheDogs() {
        for (VirtualPet allPets : theShelter.values()) {
            if (allPets instanceof RoboticDog) {
                ((RoboticDog) allPets).walkTheDoggies();
            } else if (allPets instanceof RoboticDog) {
                ((RoboticDog) allPets).walkTheDoggies();
            }
        }
    }

    public void playWithAllPets() {
        for (VirtualPet allPets : theShelter.values()) {
            ((VirtualPet) allPets).play();
        }
    }

    public void oilRoboPets() {
        for (VirtualPet allPets : theShelter.values()) {
            if (allPets instanceof RoboticPet) {
                ((RoboticPet) allPets).oilPet();
            }
        }
    }

    public void tickMethod() {
        for (VirtualPet allPets : theShelter.values()) {
            if (allPets instanceof OrganicPet) {
                ((OrganicPet) allPets).orgoTick();
            } else if (allPets instanceof RoboticPet) {
                ((RoboticPet) allPets).roboTick();
            } else if (allPets instanceof OrganicCat) {
                ((OrganicCat) allPets).tickCats();
            } else if (allPets instanceof OrganicDog) {
                ((OrganicDog) allPets).tickDog();
            }
        }
    }

        public void petDisplay () {

            for (VirtualPet pet : theShelter.values()) {
                if (pet instanceof OrganicPet){
                    System.out.println("Pet Name        |Type    |Description    |Happiness    |Health    |Poop    |Fun      |Hunger     |Thirst");
                    System.out.println(pet.toString());
                }
                else if(pet instanceof  RoboticPet){
                    System.out.println("Pet Name        |Type    |Description    |Happiness    |Health    |Poop    |Fun      |Oil");
                    System.out.println(pet.toString());
                }

            }
        }
//    public void showNames(VirtualPetShelter allPets) {
//        for (VirtualPet pet : theShelter.values()) {
//            VirtualPet petName = ;
//            System.out.println(petName.getName());
//        }
//    }

}







