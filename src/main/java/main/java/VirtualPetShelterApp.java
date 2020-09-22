package main.java;

import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterAPP {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner reply = new Scanner(System.in);
        main.java.VirtualPetShelter adoptablePets = new main.java.VirtualPetShelter();
        adoptablePets.intake(new main.java.VirtualPet("Ollie", "A Siamese Cat", 10, 10, 10, 10));
        adoptablePets.intake(new main.java.VirtualPet("Jelly", "A Persian Cat", 10, 10, 10, 10));
        adoptablePets.intake(new main.java.VirtualPet("Schnitzel", "A fat calico", 10, 10, 10, 10));
        adoptablePets.intake(new main.java.VirtualPet("Rufus", "A weird dog.", 10, 10, 10, 10));
        adoptablePets.intake(new main.java.VirtualPet("Professor", "A good pug", 10, 10, 10, 10));
        adoptablePets.intake(new main.java.VirtualPet("Stitch", "He's blue", 10, 10, 10, 10));
        System.out.println("Thanks for signing in for your shift today!");


        System.out.println("The pets we have in the shelter right now are ");
        showPetStatuses(adoptablePets);


        System.out.println("What would you like to do on your shift?");
        System.out.println("Remember to keep the pets happy and cages clean so pets are attractive for adoption. A low level is a good pet!");
        printMenu();


        while (true) {


            String menuOption = input.next();

            if (menuOption.equalsIgnoreCase("help")) {
                printMenu();
                continue;
            } else if (menuOption.equals("1")) {
                System.out.println("Thank you for feeding us!");
                adoptablePets.feedShelterPets();

            } else if (menuOption.equals("2")) {
                System.out.println("Thank you for filling the water dishes. Now we wait for the cats to knock them over again");
                adoptablePets.fillWaterBowls();
            } else if (menuOption.equals("3")) {
                System.out.println("I feel so refreshed!");
                adoptablePets.cleanPoop();

            } else if (menuOption.equals("4")) {
                System.out.println("Thanks for letting us out. Now guests can see that we've been coming out of our cages and doing just fine");
                adoptablePets.playWithAllPets();
            } else if (menuOption.equals("5")) {
                System.out.println("Congratulations on doing a great job as a shelter worker! Which pet is being adopted?");
                showPetStatuses(adoptablePets);
                String petName = input.next();
                adoptablePets.adoptPet(petName);
                showPetStatuses(adoptablePets);
                System.out.println("Bye " + petName + "! We wish you the best!");

            } else if (menuOption.equals("6")) {
                System.out.println("oh no! A pet is being brought into the shelter. Lets get them ready for a loving home. What is this pet's name?");
                String intakePetName = input.next();
                System.out.println("Please write a brief description of the pet including breed and coloring");
                String intakePetDescription = reply.nextLine();
                System.out.println("Let's help " + intakePetName + " find a good home!");
                adoptablePets.intake(new main.java.VirtualPet(intakePetName, intakePetDescription, 10, 10, 10, 10));
                showPetStatuses(adoptablePets);

            }
            else if (menuOption.equals("7")){
                showPetStatuses(adoptablePets);
            }
            else if (menuOption.equals("8")) {
                System.out.println("You're a great worker! Have a good day");
                break;
            } else {
                System.out.println("Error! Please try again.");
            }

            adoptablePets.tickMethod();
            System.out.println("Remember type 'help' to see menu!");



        }

        input.close();

    }

    private static void printMenu() {
        System.out.println("Press 1 to  feed us");
        System.out.println("Press 2 to fill our bowls");
        System.out.println("Press 3 to clean the cages");
        System.out.println("Press 4 to play with us");
        System.out.println("Press 5 to perform an adoption");
        System.out.println("Press 6 to conduct an intake");
        System.out.println("Press 7 to see the pets");
        System.out.println("Press 8 to clock out");


        System.out.println("To see menu throughout the game, type \"help\".");

    }

    public static void showPetStatuses(main.java.VirtualPetShelter adoptablePets) {
        System.out.println("Pet Name and Description    |Hunger    |Thirst    |Fun    |Poop");

        Map<String, main.java.VirtualPet> shelter = adoptablePets.getPets();
        for (Map.Entry<String, main.java.VirtualPet> entry : shelter.entrySet()) {
            main.java.VirtualPet petInfo = entry.getValue();
            System.out.println(petInfo.getName() + ", " + petInfo.getDescription() + "         |" + petInfo.getHunger() + "            |" + petInfo.getThirst() + "         |" + petInfo.getFun() + "         |" + petInfo.getHygiene());
        }

    }
}

