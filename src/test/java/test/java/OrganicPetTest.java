package test.java;

import main.java.OrganicCat;
import main.java.OrganicDog;
import main.java.OrganicPet;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrganicPetTest {
    OrganicPet judge = new OrganicCat("Judge", "organic", "Orange cat", 10, 10, 10, 10, 10,10);
     OrganicPet professor = new OrganicDog("Professor", "organic", "A good pug", 10, 10, 10, 10, 10, 10);

    @Test
    public void petShouldHaveHunger() {
        int hunger = judge.getHunger();
        int hunger2 = professor.getHunger();
        assertEquals(hunger, 10);
        assertEquals(hunger2, 10);
    }
    @Test
    public void feedShouldReduceHungerToZeroAndIncreaseBathroom(){

        judge.feed();
        professor.feed();
        int feedDecrease = judge.getHunger();
        int bathroomIncrease = judge.getHygiene();
        int feedDecrease1 = professor.getHunger();
        int bathroomIncrease1 = professor.getHygiene();
        assertEquals(feedDecrease, 0);
        assertEquals(bathroomIncrease, 11);
        assertEquals(feedDecrease1, 0);
        assertEquals(bathroomIncrease1, 11);

    }
    @Test
    public void petShouldHaveThirst() {
        int thirst = judge.getThirst();
        int thirst1 = professor.getThirst();
        assertEquals(thirst, 10);
        assertEquals(thirst1, 10);
    }
    @Test
    public void waterShouldReduceThirstAndIncreaseBathroom(){
        judge.water();
        professor.water();
        int thirst = judge.getThirst();
        int thirst1 = professor.getThirst();
        int bathroomIncrease = judge.getHygiene();
        int bathroomIncrease1=professor.getHygiene();
        assertEquals(bathroomIncrease, 13);
        assertEquals(bathroomIncrease1, 13);
        assertEquals(thirst, 0);
        assertEquals(thirst1, 0);

    }
    @Test
    public void petShouldHaveHygiene() {
        int bathroom = judge.getHygiene();
        int bathroom1 = professor.getHygiene();
        assertEquals(bathroom, 10);
        assertEquals(bathroom1, 10);
    }
    @Test
    public void pottyShouldReduceBathroomToZero() {
        judge.pottyTime();
        professor.pottyTime();
        int bathroomReduce = judge.getHygiene();
        int bathroomReduce1 = professor.getHygiene();
        assertEquals(bathroomReduce, 0);
        assertEquals(bathroomReduce1, 0);

    }
    @Test
    public void tickShouldIncreaseHungerAndThirst(){
        judge.orgoTick();
        professor.orgoTick();
        int thirst = judge.getThirst();
        int thirst1 = professor.getThirst();
        int hunger = judge.getHunger();
        int hunger1=professor.getHunger();
        assertEquals(hunger, 11);
        assertEquals(hunger1, 11);
        assertEquals(thirst, 11);
        assertEquals(thirst1, 11);

    }
}
