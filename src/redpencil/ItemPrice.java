/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redpencil;

/**
 *
 * @author tonys
 */
public class ItemPrice {
    
    
    float price;
    int   daysStable;
    
    
    public ItemPrice (float price){
        this.price = price;
    }
    
    public void setDaysStable (int daysStable){
        this.daysStable = daysStable;
    }

    public Boolean priceReduction(Float reducedPrice){
        
        Float high;
        Float low;
        high = price * .95F;
        low  = price * .70F;
        
           
        if (reducedPrice.compareTo(low) < 0) return false;
        
        if (reducedPrice.compareTo(high) > 0) return false;        
        
        
        
        
        return   true;
    }
}
