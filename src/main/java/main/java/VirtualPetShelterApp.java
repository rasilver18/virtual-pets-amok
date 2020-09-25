package main.java;

import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner reply = new Scanner(System.in);
        Scanner breed = new Scanner(System.in);
        Scanner inputTo = new Scanner(System.in);
        main.java.VirtualPetShelter adoptablePets = new main.java.VirtualPetShelter();
         adoptablePets.intake(new main.java.OrganicCat("Ollie", "organic", "A Siamese Cat", 10, 10, 10, 10, 10, 10));
        adoptablePets.intake(new main.java.RoboticCat("Jelly", "robotic", "A Persian Cat", 10, 10, 10, 10, 10));
         adoptablePets.intake(new main.java.OrganicCat("Schnitzel", "organic", "A fat calico", 10, 10, 10, 10, 10, 10));
        adoptablePets.intake(new main.java.RoboticDog("Rufus", "robotic", "Actually a Furby", 10, 10, 10, 10, 10));
        adoptablePets.intake(new main.java.OrganicDog("Professor", "organic", "A good pug", 10, 10, 10, 10, 10, 10));
          adoptablePets.intake(new main.java.RoboticDog("Stitch", "robotic", "He's blue", 10, 10, 10, 10, 10));

        System.out.println("Thanks for signing in for your shift today!");


        System.out.println("The pets we have in the shelter right now are ");
        adoptablePets.petDisplay();


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
                System.out.println("Do you want to play with all pets or a one pet? Type all for all or one for one");
                String playOption =inputTo.nextLine();
                if (playOption.equalsIgnoreCase("one")){
                    System.out.println("Which pet do you want to play with?");
                    String petName =reply.nextLine();
                    adoptablePets.playWithOnePet(petName);
                    System.out.println("Thank you for playing with " + petName);
                }
                else if (playOption.equalsIgnoreCase("all")) {
                    System.out.println("Thanks for letting us out. Now guests can see that we've been coming out of our cages and doing just fine");
                    adoptablePets.playWithAllPets();
                }
            } else if (menuOption.equals("5")) {
                System.out.println("Those litterboxes were starting to smell. Thank you! ");
                adoptablePets.cleanAllLitterbox();
            } else if (menuOption.equals("6")) {
                System.out.println("Yay! We are so excited for the walk! Now we will be less likely to pee in our cages.");
                adoptablePets.walkTheDogs();
            } else if (menuOption.equals("7")) {
                System.out.println("We were getting a little rusty. Thank you for the oil");
                adoptablePets.oilRoboPets();
            } else if (menuOption.equals("8")) {
                System.out.println("Congratulations on doing a great job as a shelter worker! Which pet is being adopted?");
//                adoptablePets.displayPetName();
                String petName = input.next();
                adoptablePets.adoptPet(petName);
             adoptablePets.petDisplay();
                System.out.println("Bye " + petName + "! We wish you the best!");

            } else if (menuOption.equals("9")) {
                System.out.println("oh no! A pet is being brought into the shelter. Lets get them ready for a loving home. What is this pet's name?");
                String intakePetName = input.next();
                System.out.println("Please write a brief description of the pet including breed and coloring");
                String intakePetDescription = reply.nextLine();
                System.out.println("Let's help " + intakePetName + " find a good home!");
                System.out.println("What type of pet is this? You may select an organic cat, organic dog, robotic cat, or robotic dog.");
                String petType = breed.nextLine();
                if (petType.equalsIgnoreCase("organic cat")) {
                    VirtualPet returnedPet = new OrganicCat(intakePetName, "organic", intakePetDescription, 10, 10, 10, 10, 10, 10);
                    adoptablePets.intake(returnedPet);
                } else if (petType.equalsIgnoreCase("organic dog")) {
                    VirtualPet returnedPet = new OrganicDog(intakePetName, "organic", intakePetDescription, 10, 10, 10, 10, 10, 10);
                    adoptablePets.intake(returnedPet);
                } else if (petType.equalsIgnoreCase("robotic cat")) {
                    VirtualPet returnedPet = new RoboticCat(intakePetName, "robotic", intakePetDescription, 10, 10, 10, 10, 10);
                    adoptablePets.intake(returnedPet);
                } else if (petType.equalsIgnoreCase("robotic dog")) {
                    VirtualPet returnedPet = new RoboticDog(intakePetName, "robotic", intakePetDescription, 10, 10, 10, 10, 10);
                    adoptablePets.intake(returnedPet);
                }
                ;
                adoptablePets.petDisplay();

            } else if (menuOption.equals("10")) {
               adoptablePets.petDisplay();
            } else if (menuOption.equals("11")) {
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
        System.out.println("Press 5 to scoop the litterbox");
        System.out.println("Press 6 to walk the dogs");
        System.out.println("Press 7 to oil the Robotic Pets");
        System.out.println("Press 8 to perform an adoption");
        System.out.println("Press 9 to conduct an intake");
        System.out.println("Press 10 to see the pets");
        System.out.println("Press 11 to clock out");


        System.out.println("To see menu throughout the game, type \"help\".");

   }

    }









