package callOfDuty;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TargetTest {
	
    Base base;
    Armory armory;
    Barrack barrack;
    SentryTower st;
    Tank tank;
    OilDrum od;
    
    @BeforeEach
    void setUp() throws Exception {
    
    	base = new Base();
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                new Ground(base).placeTargetAt(i, j, true);
            }
        }
        
        armory = new Armory(base);
        armory.placeTargetAt(0, 0, true);
        
        barrack = new Barrack(base);
        barrack.placeTargetAt(0, 4, true);
        
        st = new SentryTower(base);
        st.placeTargetAt(2, 4, true);
        
        tank = new Tank(base);
        tank.placeTargetAt(1, 3, true);
        
        od = new OilDrum(base);
        od.placeTargetAt(2, 1, true);
    }

    @Test
    void testTarget() {
    	
        // Armory
        assertEquals(2, armory.getHit().length);
        assertEquals(3, armory.getHit()[0].length);
        
        // Barrack
        assertEquals(1, barrack.getHit().length);
        assertEquals(3, barrack.getHit()[0].length);
        
        // Ground
        assertEquals(1, od.getHit().length);
        assertEquals(1, od.getHit()[0].length);

        // TODO: add more cases
    }

    @Test
    void testToString() {
        assertEquals("O", st.toString());
        assertEquals("T", tank.toString());
        
        // TODO: add more cases
    }

    @Test
    void testGetTargetType() {
        assertEquals("tank", tank.getTargetType());
        assertEquals("sentryTower", st.getTargetType());
        assertEquals("oilDrum", od.getTargetType());
        
        // TODO: add more cases
    }

    @Test
    void testExplode() {
        assertFalse(armory.isDestroyed());
        od.explode();
        assertTrue(armory.isDestroyed());
        
        // TODO: add more cases
    }

    @Test
    void testGetBase() {
        assertEquals(base, od.getBase());
        
        // TODO: add more cases
    }

    @Test
    void testGetCoordinate() {
        assertEquals(2, od.getCoordinate()[0]);
        assertEquals(1, od.getCoordinate()[1]);
        
        // TODO: add more cases
    }

    @Test
    void testSetCoordinate() {
        od.setCoordinate(new int[] {3, 2});
        assertEquals(3, od.getCoordinate()[0]);
        assertEquals(2, od.getCoordinate()[1]);
        
        // TODO: add more cases
    }

    @Test
    void testIsHorizontal() {
        assertTrue(armory.isHorizontal());
        
        // TODO: add more cases
    }

    @Test
    void testSetHorizontal() {
        armory.setHorizontal(false);
        assertFalse(armory.isHorizontal());
        
        // TODO: add more cases
    }

    @Test
    void testGetHit() {
        assertEquals(2, armory.getHit().length);
        assertEquals(3, armory.getHit()[0].length);
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                assertEquals(0, armory.getHit()[i][j]);
            }
        }
        
        // TODO: add more cases
    }

    @Test
    void testOkToPlaceTargetAt() {
        assertFalse(new Armory(base).okToPlaceTargetAt(1, 7, false));
        assertFalse(new Armory(base).okToPlaceTargetAt(1, 8, true));
        assertTrue(new Armory(base).okToPlaceTargetAt(1, 8, false));
        
        // TODO: add more cases
    }

    @Test
    void testPlaceTargetAt() {
        armory.placeTargetAt(5, 5, false);
        assertEquals(5, armory.getCoordinate()[0]);
        assertEquals(5, armory.getCoordinate()[1]);
        assertEquals(3, armory.getHit().length);
        assertEquals(2, armory.getHit()[0].length);
        
        // TODO: add more cases
    }

    @Test
    void testGetShot() {
        armory.placeTargetAt(5, 5, false);
        armory.getShot(5, 6);
        assertEquals(1, armory.getHit()[0][1]);
        
        // TODO: add more cases
    }

    @Test
    void testIsDestroyed() {
    	assertFalse(od.isDestroyed());
        od.getShot(2, 1);
        assertTrue(od.isDestroyed());
        assertTrue(tank.isDestroyed());
       
        // TODO: add more cases

    }

    @Test
    void testGetLocationHit() {
        armory.placeTargetAt(5, 5, true);
        assertFalse(armory.getLocationHit(5, 5));
        armory.getShot(5, 5);
        assertTrue(armory.getLocationHit(5, 5));
        
        // TODO: add more cases
    }

}
