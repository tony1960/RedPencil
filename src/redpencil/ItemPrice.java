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
    float reducedPrice;
    int daysStable;

    /**
     * Sets initial  conditions
     *
     *
     * @param price The orig price of the item
     * @param daysStable THe number of days at this price
     * @return true if the, otherwise false
     */
    
    
    public void initCondtions(float price, int daysStable) {
        this.price = price;
        this.daysStable = daysStable;
    }

    /*   reafactored
    public ItemPrice(float price) {

        this.price = price;
    }
     */
    /*
    public void setDaysStable(int daysStable) {
        this.daysStable = daysStable;
    }
    */

    
     /**
     * Sets initial  conditions
     *
     *
     * @param reducedPrice The new reduced price 
     * @return true if activation is allowed , otherwise false
     */
       public Boolean priceReduction(Float reducedPrice) {

        Float high;
        Float low;
        high = price * .95F;
        low = price * .70F;

        if (reducedPrice.compareTo(low) < 0) {
            return false;
        }

        if (reducedPrice.compareTo(high) > 0) {
            return false;
        }

        if (daysStable < 30) {
            return false;
        }
        if (this.reducedPrice == 0) {
            daysStable = 0;
        } // Else days stable remain the same
        this.reducedPrice = reducedPrice;

        return true;
    }

       /**
     * Sets initial  conditions
     *
     *
     * @return  number of days remaining in the promotion
     */
    public int daysRemaining() {

        return 30 - daysStable;
    }

    /**
     * Sets initial  conditions
     *
     *
     * @return true if promtion is still valid , otherwise false
     */
    public Boolean promotionStillValid() {

        if (daysStable > 30) {
            return false;
        }
        return true;
    }
}
