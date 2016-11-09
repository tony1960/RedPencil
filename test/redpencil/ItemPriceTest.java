/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redpencil;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tonys
 */
public class ItemPriceTest {

    ItemPrice instance;

    public ItemPriceTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new ItemPrice();

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of priceReduction method, of class ItemPrice.
     */
    @Test
    public void testPriceReduction() {
        System.out.println("priceReduction");

        instance.initCondtions(10, 31);
        Boolean result = instance.priceReduction(9.0F);
        assertTrue("True mean activation can occur", result);
    }

    @Test
    public void testPriceReductionFalseLow() {
        System.out.println("priceReduction");

        instance.initCondtions(10, 31);
        Boolean result = instance.priceReduction(1.0F);
        assertFalse("True mean activation can occur", result);
    }
    
    
    @Test
    public void testPriceReductionLowerBound() {
        System.out.println("priceReductionLowerBound");
                instance.initCondtions(10, 31);

        Boolean result = instance.priceReduction(7.0F);
        assertTrue("True mean activation can occur", result);
    }

    @Test
    public void testPriceReductionUpperBound() {
        System.out.println("priceReductionUpperBound");
                instance.initCondtions(10, 31);

        Boolean result = instance.priceReduction(9.5F);
        assertTrue("True mean activation can occur", result);
    }

    @Test
    public void testPriceReductiomDaysStable() {
        System.out.println("priceReductionUpperBound");
      
                instance.initCondtions(10, 31);

        Boolean result = instance.priceReduction(8.5F);
        assertTrue("True mean activation can occur ", result);
    }

    
    @Test
    public void testCheckPromotion() {
        System.out.println("testCheckPromotion");
        Boolean expectedValue = true;
                instance.initCondtions(10, 29);

        Boolean result = instance.priceReduction(8.5F);
        Boolean valid = instance.promotionStillValid();
     assertTrue("True mean activation can occur ", valid);

    }
    
   
    @Test
     public void testPriceFurtherReduction() {
        System.out.println("priceReduction");
                instance.initCondtions(10, 29);
        int ExpectedValue = 1;
        Boolean result = instance.priceReduction(9.0F);
        int promotionDays = instance.daysRemaining();
        //assertTrue("Init Test", result);
        assertEquals (ExpectedValue, promotionDays);
    }
  
}
