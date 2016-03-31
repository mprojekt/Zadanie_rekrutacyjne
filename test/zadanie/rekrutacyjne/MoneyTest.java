package zadanie.rekrutacyjne;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class MoneyTest {
    
    Money instance;
    
    @Before
    public void setUp() {
        instance = new Money(0, 0);
    }
    
    @Test
    public void testConstructor() {
        instance = new Money(3.47);
        assertEquals("3,47", instance.toString());
        
        instance = new Money(-6.20);
        assertEquals("-6,20", instance.toString());
    }
    
    @Test
    public void testAdd_double() {
        instance.add(3.57);
        assertEquals("3,57", instance.toString());
        
        instance.add(2.90);
        assertEquals("6,47", instance.toString());
        
        instance.add(-9.99);
        assertEquals("-3,52", instance.toString());
        
        instance.add(-1.52);
        assertEquals("-5,04", instance.toString());
    }

    @Test
    public void testAdd_int() {
        instance.add(3, 57);
        assertEquals("3,57", instance.toString());
        
        instance.add(2, 90);
        assertEquals("6,47", instance.toString());
        
        instance.add(-9, 99);
        assertEquals("-3,52", instance.toString());
        
        instance.add(1, -52);
        assertEquals("-5,04", instance.toString());
    }
    
    @Test
    public void testSub_double() {
        instance.sub(3.57);
        assertEquals("-3,57", instance.toString());
        
        instance.sub(2.90);
        assertEquals("-6,47", instance.toString());
        
        instance.sub(-9.99);
        assertEquals("3,52", instance.toString());
        
        instance.sub(-1.52);
        assertEquals("5,04", instance.toString());
    }

    @Test
    public void testSub_int() {
        instance.sub(3, 57);
        assertEquals("-3,57", instance.toString());
        
        instance.sub(2, 90);
        assertEquals("-6,47", instance.toString());
        
        instance.sub(-9, 99);
        assertEquals("3,52", instance.toString());
        
        instance.sub(1, -52);
        assertEquals("5,04", instance.toString());
    }

    @Test
    public void testGetZlote() {
        assertEquals(0, instance.getZlote());
    }

    @Test
    public void testSetZlote() {
        instance.setZlote(0);        
        assertEquals(0, instance.getZlote());
        
        instance.setZlote(5);        
        assertEquals(5, instance.getZlote());
        
        instance.setZlote(235);        
        assertEquals(235, instance.getZlote());
    }

    @Test
    public void testGetGrosze() {
        assertEquals(0, instance.getGrosze());
    }

    @Test
    public void testSetGrosze() {
        instance.setGrosze(0);        
        assertEquals(0, instance.getGrosze());
        
        instance.setGrosze(5);        
        assertEquals(5, instance.getGrosze());
        
        instance.setGrosze(235);        
        assertEquals(35, instance.getGrosze());
    }

    @Test
    public void testToString() {
        instance = new Money(5, 35);
        assertEquals("5,35", instance.toString());
        
        instance = new Money(158, 9);
        assertEquals("158,09", instance.toString());
        
        instance = new Money(-98, 26);
        assertEquals("-98,26", instance.toString());
    }
    
}
