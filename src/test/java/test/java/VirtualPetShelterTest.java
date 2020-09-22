package test.java;

import main.java.VirtualPet;
import main.java.VirtualPetShelter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class VirtualPetShelterTest {
    VirtualPet underTest = new VirtualPet("Judge" , "An Orange Cat" , 10, 10, 10, 10);
    VirtualPetShelter underTestShelter = new VirtualPetShelter();
    VirtualPet adoptablePet = new VirtualPet("Ollie", "A Siamese Cat", 10, 10, 10, 10);



    @Test
    public void petShouldHaveName() {
        String petName = underTest.getName();
        assertEquals(petName, "Judge");
    }

    @Test
    public void petShouldHaveSpecies() {
        String petSpecies = underTest.getDescription();
        assertEquals(petSpecies, "An Orange Cat");
    }


    @Test
    public void petShouldHaveHunger() {
        int hunger = underTest.getHunger();
        assertEquals(hunger, 10);
    }
    @Test
    public void feedShouldReduceHungerToZeroAndIncreaseBathroom(){
        underTest.feed();
        int feedDecrease = underTest.getHunger();
        int bathroomIncrease = underTest.getHygiene();
        assertEquals(feedDecrease, 0);
        assertEquals(bathroomIncrease, 11);

    }

    @Test
    public void playShouldDecreaseFunToZeroAndInfluenceAllOtherLevels(){
        underTest.play();
        int playReduceFun = underTest.getFun();
        int playIncreaseHunger = underTest.getHunger();
        int playIncreaseThirst = underTest.getThirst();
        int playDecreaseBathroom = underTest.getHygiene();
        assertEquals(playReduceFun, 0);
        assertEquals(playIncreaseHunger, 11);
        assertEquals(playIncreaseThirst, 11);
        assertEquals(playDecreaseBathroom, 9);

    }





    @Test
    public void petShouldHaveThirst() {
        int thirst = underTest.getThirst();
        assertEquals(thirst, 10);
    }
    @Test
    public void waterShouldReduceThirstAndIncreaseBathroom(){
        underTest.water();
        int waterReduceThirst = underTest.getThirst();
        int waterIncreaseBathroom = underTest.getHygiene();
        assertEquals(waterReduceThirst, 0);
        assertEquals(waterIncreaseBathroom, 11);

    }


    @Test
    public void petShouldHaveFun() {
        int fun = underTest.getFun();
        assertEquals (fun, 10);
    }

    @Test
    public void petShouldHaveHygiene() {
        int bathroom = underTest.getHygiene();
        assertEquals(bathroom, 10);
    }
    @Test
    public void pottyShouldReduceBathroomToZero() {
        underTest.pottyTime();
        int bathroomReduce = underTest.getHygiene();
        assertEquals(bathroomReduce, 0);

    }
    @Test
    public void tickMethod(){
        underTest.tick();
        int bathroomIncrease = underTest.getHygiene();
        int playIncrease = underTest.getFun();
        assertEquals(bathroomIncrease, 11);
        assertEquals(playIncrease, 11);

    }
    @Test
    public void intakeShouldAddPet(){
        underTestShelter.intake(adoptablePet);
        String newPet = adoptablePet.getName();
        assertEquals(newPet, "Ollie");
    }

    @Test
    public void adoptShouldRemovePet(){
        underTestShelter.adoptPet("Judge");
        assertNotEquals("Judge", "Ollie");



    }

    @Test
    public void feedShelterPetsShouldFeedAll(){
        underTestShelter.feedShelterPets();
        adoptablePet.feed();
        assertEquals(adoptablePet.getHunger(), 0);



    }

    @Test
    public void fillWaterBowlsShouldWaterAll(){
        underTestShelter.intake(underTest);
        underTestShelter.intake(adoptablePet);
        underTestShelter.fillWaterBowls();
        assertEquals(adoptablePet.getThirst(), 0);
        assertEquals(underTest.getThirst(), 0);
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
    @Test
    public void tickAllPets(){
        underTestShelter.intake(adoptablePet);
        underTestShelter.tickMethod();
        assertEquals(adoptablePet.getHygiene(), 11 );
    }



}
