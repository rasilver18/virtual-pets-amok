package test.java;

import main.java.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogTest {
    OrganicDog rufus = new OrganicDog("Rufus" ,"organic", "A crazy weirdo" , 10, 10, 10, 10, 10, 10);
    VirtualPetShelter underTest = new VirtualPetShelter();
    RoboticDog furby = new RoboticDog("Furby", "robotic", "May be possessed", 10, 10, 10, 10, 10);

    @Test
    public void walkShouldDecreaseFunLevel(){
        rufus.walkTheDoggies();
        furby.walkTheDoggies();
        int playDecrease = rufus.getFun();
        int playDecrease1 = furby.getFun();
        assertEquals(playDecrease, 0);
        assertEquals(playDecrease1, 0);

    }
    @Test
    public void walkShouldDecreaseBathroomForOrganicDog(){
        rufus.walkTheDoggies();
        int bathroomDecrease =rufus.getHygiene();
        assertEquals(bathroomDecrease, 4);

    }
}
