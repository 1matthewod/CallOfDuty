package callOfDuty;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BaseTest {
	
    Base base;
    
    @BeforeEach
    void setUp() throws Exception {
    
    	base = new Base();
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
               new Ground(base).placeTargetAt(i, j, true);
            }
        }
        
    }

    @Test
    void testBase() {
        assertEquals(10, base.getTargetsArray().length);
        assertEquals(10, base.getTargetsArray()[0].length);
        
        // TODO: add more cases
    }

    @Test
    void testPlaceAllTargetRandomly() {
        
    	base.placeAllTargetRandomly();
        
    	List<Target> list = new ArrayList<Target>();
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if(base.getTargetsArray()[i][j].getTargetType() != "ground") {
                    if(!list.contains(base.getTargetsArray()[i][j])) {
                        list.add(base.getTargetsArray()[i][j]);
                    }
                }
            }
        }
        assertEquals(list.size(), 18);
    }

    @Test
    void testIsOccupied() {
        
    	Armory arm = new Armory(base);
        arm.placeTargetAt(0, 0, true);
        assertTrue(base.isOccupied(0, 0));
        
        // TODO: add more cases
    }

    @Test
    void testShootAt() {
        
    	Armory arm = new Armory(base);
        arm.placeTargetAt(5, 5, true);
        
        base.shootAt(5, 5);
        assertTrue(arm.getLocationHit(5, 5));
        
        // TODO: add more cases
    }

    @Test
    void testIsGameOver() {
        
    	base.placeAllTargetRandomly();
        assertFalse(base.isGameOver(new RocketLaucher(base), new Missile(base) ));
        
        // TODO: add more cases
    }

    @Test
    void testWin() {
        
    	OilDrum od = new OilDrum(base);
        od.placeTargetAt(0, 0, true);
        assertFalse(base.win());
        
        base.shootAt(0, 0);
        assertTrue(base.win());
        
        // TODO: add more cases
    }


    @Test
    void testIncrementShotsFired() {
    	
        assertEquals(0, base.getShotsFired());
        base.incrementShotsFired();
        assertEquals(1, base.getShotsFired());
        
        // TODO: add more cases
    }

    @Test
    void testSetDestroyedTargetCount() {
        base.setDestroyedTargetCount(10);
        assertEquals(10, base.getDestroyedTargetCount());
        
        // TODO: add more cases
    }

    @Test
    void testGetShotsFired() {
        assertEquals(0, base.getShotsFired());
        
        base.shootAt(0, 0);
        assertEquals(1, base.getShotsFired());
        
        // TODO: add more cases
    }

    @Test
    void testGetTargetsArray() {
        assertEquals(10, base.getTargetsArray().length);
        assertEquals(10, base.getTargetsArray()[0].length);
        
        // TODO: add more cases
    }

    @Test
    void testGetDestroyedTargetCount() {
        
    	OilDrum od = new OilDrum(base);
        od.placeTargetAt(0, 0, true);
        assertEquals(0, base.getDestroyedTargetCount());
        
        base.shootAt(0, 0);
        assertEquals(1, base.getDestroyedTargetCount());
        
        // TODO: add more cases
    }

}
