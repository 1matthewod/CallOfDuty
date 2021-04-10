package callOfDuty;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WeaponTest {
	
    Base base;
    Missile mis;
    RocketLaucher rl;

    @BeforeEach
    void setUp() throws Exception {
    
    	base = new Base();
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                new Ground(base).placeTargetAt(i, j, true);
            }
        }
        
        mis = new Missile(base);
        rl = new RocketLaucher(base);
    }

    @Test
    void testWeapon() {
        assertEquals(3, mis.getShotLeft());
        
        // TODO: add more cases
    }

    @Test
    void testGetWeaponType() {
        assertEquals("missile", mis.getWeaponType());
        
        // TODO: add more cases
    }

    @Test
    void testGetBase() {
        assertEquals(base, mis.getBase());
        
        // TODO: add more cases
    }

    @Test
    void testGetShotLeft() {
        mis.shootAt(0, 0);
        assertEquals(2, mis.getShotLeft());
        
        // TODO: add more cases
    }

    @Test
    void testDecrementShotleft() {
        mis.decrementShotleft();
        assertEquals(2, mis.getShotLeft());
        
        // TODO: add more cases
    }

    @Test
    void testShootAt() {
        rl.shootAt(0, 0);
        assertTrue(base.getTargetsArray()[0][0].getLocationHit(0, 0));
        
        // TODO: add more cases
    }

}
