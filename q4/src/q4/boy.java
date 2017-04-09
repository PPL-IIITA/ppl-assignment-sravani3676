/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

/**
 *
 * @author sravani
 */
public class boy {
    int name;
    int intelligence;
    int attractiveness;
    int budget;
    int happiness;
    int type;
    int booked;
    int valantine;
    boy(int j){
        rand r = new rand();
        intelligence = r.getRandomNumberInRange(100,500);
        attractiveness = r.getRandomNumberInRange(1,10);
        budget = r.getRandomNumberInRange(25000,50000);
        name = j;
        booked = 0;
        type =  r.getRandomNumberInRange(1,3);
        //System.out.println(intelligence);
    }
}
