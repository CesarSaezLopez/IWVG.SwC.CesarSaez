package es.upm.miw.iwvg.csl1test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.iwvg.csl1.Numbers;


public class NumbersTest {

    
    Numbers n;
         
    @Before
    public void before() {
        n = new Numbers(20,5);
    }
    
    @Test
    public void testSum() {
        assertEquals(25, this.n.sum());
    }
    
    @Test
    public void testSubtraction() {
    //    assertEquals(20, this.n.subtraction());
    }
    
    @Test
    public void testMultiply() {
    //    assertEquals(100, this.n.multiply());
    }
    
    @Test
    public void testDivide() {
    //    assertEquals(4, this.n.divide());
    }
    
    
   
    
   
}
