package test.java;

import main.java.OrganicCat;
import main.java.RoboticCat;
import main.java.VirtualPet;
import main.java.VirtualPetShelter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class VirtualPetShelterTest {
    VirtualPet underTest = new OrganicCat("Judge" ,"organic", "An Orange Cat" , 10, 10, 10, 10, 10, 10);
    VirtualPetShelter underTestShelter = new VirtualPetShelter();
    VirtualPet adoptablePet = new RoboticCat("Ollie", "robotic", "A Siamese Cat", 10, 10, 10, 10, 10);



    @Test
    public void petShouldHaveName() {
        String petName = underTest.getName();
        String petName1 =adoptablePet.getName();
        assertEquals(petName, "Judge");
        assertEquals(petName1, "Ollie");

    }

    @Test
    public void petShouldHaveDescription() {
        String petDescription = underTest.getDescription();
        assertEquals(petDescription, "An Orange Cat");
    }
    @Test
    public void petShouldHaveFun() {
        int fun = underTest.getFun();
        int fun1 = adoptablePet.getFun();
        assertEquals (fun, 10);
        assertEquals(fun1, 10);
    }



    @Test
    public void playShouldDecreaseFunToZeroAndInfluenceAllOtherLevels(){
        underTest.play();
        adoptablePet.play();
        int playReduceFun = underTest.getFun();
        int playDecreaseHappiness = underTest.getHappiness();
        int playDecreaseHealth = underTest.getHealth();
        int playDecreaseBathroom = underTest.getHygiene();
        int playReduceFun1 = adoptablePet.getFun();
        int playDecreaseHappiness1 = adoptablePet.getHappiness();
        int playDecreaseHealth1 = adoptablePet.getHealth();
        int playDecreaseBathroom1 = adoptablePet.getHygiene();
        assertEquals(playReduceFun, 0);
        assertEquals(playDecreaseHappiness, 9);
        assertEquals(playDecreaseHealth, 9);
        assertEquals(playDecreaseBathroom, 9);
        assertEquals(playReduceFun1, 0);
        assertEquals(playDecreaseHappiness1, 9);
        assertEquals(playDecreaseHealth1, 9);
        assertEquals(playDecreaseBathroom1, 9);

    }


    @Test
    public void tickMethod(){
        underTest.tick();
        adoptablePet.tick();
        int tickFun = underTest.getFun();
        int tickHappiness = underTest.getHappiness();
        int tickHealth = underTest.getHealth();
        int tickBathroom = underTest.getHygiene();
        int tickFun1 = adoptablePet.getFun();
        int tickHappiness1 = adoptablePet.getHappiness();
        int tickHealth1 = adoptablePet.getHealth();
        int tickBathroom1 = adoptablePet.getHygiene();
        assertEquals(tickFun, 11);
        assertEquals(tickHappiness, 11);
        assertEquals(tickHealth, 11);
        assertEquals(tickBathroom, 11);
        assertEquals(tickFun1, 11);
        assertEquals(tickHappiness1, 11);
        assertEquals(tickHealth1, 11);
        assertEquals(tickBathroom1, 11);

    }

    @Test
    public void intakeShouldAddPet(){
        underTestShelter.intake(adoptablePet);
        underTestShelter.intake(underTest);
        String newPet = adoptablePet.getName();
        String newPet1 = underTest.getName();
        assertEquals(newPet, "Ollie");
        assertEquals(newPet1, "Judge");
    }

    @Test
    public void adoptShouldRemovePet(){
        underTestShelter.adoptPet("Judge");
        underTestShelter.adoptPet("Ollie");
        assertNotEquals("Ollie", "Penny");
        assertNotEquals("Judge", "Schnitzel");

    }

    @Test
    public void cleanPoopShouldGiveHygieneToAll(){
        underTestShelter.intake(underTest);
        underTestShelter.intake(adoptablePet);
        underTestShelter.cleanPoop();
        assertEquals(adoptablePet.getHygiene(), 0);
        assertEquals(underTest.getHygiene(), 0);
    }

    @Test
    public void playWithAllShouldBeFunForAll(){
        underTestShelter.intake(underTest);
        underTestShelter.intake(adoptablePet);
        underTestShelter.playWithAllPets();
        assertEquals(adoptablePet.getFun(), 0);
        assertEquals(underTest.getFun(), 0);
    }




}
