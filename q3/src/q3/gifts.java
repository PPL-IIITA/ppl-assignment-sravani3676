/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

/**
 *
 * @author sravani
 */
public class gifts {
    int price;
    int value;
    int type;
    gifts(){
        rand r = new rand();
        price = r.getRandomNumberInRange(500,3000);
        value = r.getRandomNumberInRange(1,100);
        type = r.getRandomNumberInRange(1,3);
        
    } 
    
}
