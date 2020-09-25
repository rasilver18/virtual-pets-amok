package test.java;

import main.java.RoboticCat;
import main.java.OrganicCat;
import main.java.VirtualPet;
import main.java.VirtualPetShelter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {
   OrganicCat judge = new OrganicCat("Judge" ,"organic", "An Orange Cat" , 10, 10, 10, 10, 10, 10);
        VirtualPetShelter underTest = new VirtualPetShelter();
    RoboticCat furby = new RoboticCat("Furby", "robotic", "May be possessed", 10, 10, 10, 10, 10);


        @Test
        public void litterboxShouldReduceBathroom() {
            judge.cleanLitterbox();
            furby.cleanLitterbox();
            int litterbox = furby.getHygiene();
            int litterbox2 = judge.getHygiene();
            assertEquals(litterbox, 5);
            assertEquals(litterbox2, 5);

        }

        }
