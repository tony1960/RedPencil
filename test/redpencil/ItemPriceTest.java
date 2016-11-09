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
       instance = new ItemPrice(10.0F);

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
        Boolean result = instance.priceReduction(9.0F);
        assertTrue ("Price falls wtih bouns", result);
    }
    
    @Test
    public void testPriceReductionLowerBound(){
        System.out.println("priceReductionLowerBound");
        Boolean result = instance.priceReduction(7.0F);
        assertTrue ("Price falls wtih bouns", result);
    }
    
    
    
    
}
