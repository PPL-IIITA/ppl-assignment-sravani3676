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
public class girl {
    int name;
    int intelligence;
    int attractiveness;
    int maintenance;
    int happiness;
    int criteria;
    int type;
    int paired;
  //  rand r = new rand();
    girl(int i){
        rand r = new rand();
        intelligence = r.getRandomNumberInRange(100,500);
        attractiveness = r.getRandomNumberInRange(1,10);
        maintenance = r.getRandomNumberInRange(1000,5000);
        criteria = r.getRandomNumberInRange(1,3);
        name =i;
        type = r.getRandomNumberInRange(1,3);
        paired = 0;
       // System.out.println(intelligence);
    }
}
