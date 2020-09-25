package test.java;

import main.java.RoboticCat;
import main.java.RoboticDog;
import main.java.RoboticPet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoboticPetTest {
    RoboticPet stitch = new RoboticDog("Stitch", "robotic", "He's blue", 10, 10, 10, 10, 10);
    RoboticPet jelly = new RoboticCat("Jelly", "robotic", "A Persian Cat", 10, 10, 10, 10, 10);

    @Test
    public void petShouldHaveOilLevel(){
        int oilLevel = stitch.getOilLevel();
        int oilLevel1 = jelly.getOilLevel();

        assertEquals(oilLevel, 10);
        assertEquals(oilLevel1, 10);
    }

    @Test
    public void oilPetsShouldDecreaseOil(){
        stitch.oilPet();
        jelly.oilPet();
        int oilLevel = stitch.getOilLevel();
        int oilLevel1 = jelly.getOilLevel();

        assertEquals(oilLevel, 0);
        assertEquals(oilLevel1, 0);

    }
    @Test
    public void tickShouldIncreaseOil(){
        stitch.roboTick();
        jelly.roboTick();
        int oilLevel = stitch.getOilLevel();
        int oilLevel1 = jelly.getOilLevel();

        assertEquals(oilLevel, 11);
        assertEquals(oilLevel1, 11);

    }

}
