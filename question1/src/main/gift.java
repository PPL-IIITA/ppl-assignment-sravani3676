/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author sravani
 */
public class gift {
    int price;
    int value;
    int type;
    void fun(){
        rand r = new rand();
        price = r.getRandomNumberInRange(5000,30000);
        value = r.getRandomNumberInRange(1,100);
        type = r.getRandomNumberInRange(1,3);
        
    } 
}
