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
public class RedPencil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ItemPrice ip = new ItemPrice(10.0F);
        Boolean priceSet = ip.priceReduction(9.0F);
    }
    
}
