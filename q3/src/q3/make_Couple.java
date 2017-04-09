package q3;

import java.io.IOException;
import  java.lang.NullPointerException;

/*import java.io.FileWriter;
import java.lang.*;
import java.util.*;
import java.io.*;*/
public class make_Couple{
    
    static void make(girl[] g,boy[] b,gifts[] gi,couple[] c)throws IOException {
            
            int i;
            int l;
            l = 1;
            for( i = 1;i<=15;i++) {
           if(g[i].type == 1) {
               g[i]=new choosy_girl(i);
           }
           if(g[i].type == 2){
               g[i]=new desparate_girl(i);
           }
           if(g[i].type == 3){
               g[i]=new normal_girl(i);
           }
        }
        for(int j=1; j<=20; j++) {
            //i = j-23434;
            //b[j] = new boy(j+23435);
            if(b[j].type == 1){
                b[j] = new greeky_boy(j+23435);
            } 
            if(b[j].type == 2){
                b[j]=new generous_boy(j+23435);
            }
            if(b[j].type == 3){
                b[j] = new miser_boy(j+23435);
            }
            //System.out.println(b[j].name);
        }
            for(i= 1;i<15;i++) {
                rand r = new rand();
                int j= r.getRandomNumberInRange(1,20);
                //int j = k-23435;
                if(g[i].type == 1){
                    if(g[i].maintenance  <= b[j].budget && b[j].booked == 0 && b[j].attractiveness >= 6){
                        b[j].booked = 1;
                        g[i].paired = 1;
                        //System.out.print(l);
                        c[l].boy_id = j+23435;
                         //System.out.println(c[l].boy_id);
                        c[l].girl_id = i;
                        l++;
                    }
                }
                if(g[i].type == 2){
                    if(g[i].maintenance  <= b[j].budget && b[j].booked == 0 && b[j].budget  >= 35000){
                        b[j].booked = 1;
                        g[i].paired = 1;
                        c[l].boy_id = j+23435;
                        // System.out.println(c[l].boy_id);
                        c[l].girl_id = i;
                        l++;
                    }
                }
                if(g[i].type == 3){
                    if(g[i].maintenance  <= b[j].budget && b[j].booked == 0 && b[j].attractiveness >= 5&& b[j].intelligence >=300 ){
                        b[j].booked = 1;
                        g[i].paired = 1;
                        c[l].boy_id = j+23435;
                        //System.out.println(c[l].boy_id);
                        c[l].girl_id = i;
                        l++;
                    }
                }
                
                //System.out.println(c[l].boy_id)
            }
            
            for(i=1;i<=15;i++) {
                if(g[i].paired == 0){
                    for(int j = 1;j<=20;j++){
                        if(b[j].booked == 0){
                            b[j].booked = 1;
                            g[i].paired = 1;
                            c[l].boy_id = j+23435;
                           // System.out.println(c[l].boy_id);
                            c[l].girl_id = i;
                            l++;
                            break;
                        }
                    }
                }
            }
          for(i=1;i<=15;i++) {
                           int y = searchb(c[i],b);
              //System.out.println(y);
              if(y == 0){
                 // System.out.println("hiii");
                  continue;
              }
              int z = searchg(c[i],g);
              //int m = g[z].maintenance;
              int[] q = new int[500];
              int w = 1;
              if(b[y].type == 1) {
                  System.out.println("boy id " +b[y].name +"  girl id "+ g[z].name +" ");
                  while(c[i].gift_price <= g[z].maintenance){
                       rand r = new rand();
                       int k= r.getRandomNumberInRange(1,50);
                       
                       if(search(k,q,w) == 0 ) {
                           continue;
                       }
                       q[w]=k;
                       w++;
                        c[i].gift_price += gi[k].price;
                        System.out.println(gi[k].price + " " + gi[k].value);
                    
                    }
                  b[y].happiness = g[z].intelligence;
                      if( g[z].type == 1){
                           int u = c[i].gift_price/g[z].maintenance;
                          
                           g[z].happiness =  (int) java.lang.Math.log(u);
                           c[i].happiness =  g[z].happiness + b[y].happiness;
                           c[i].compatibility =  java.lang.Math.abs(b[y].budget-g[z].maintenance)+ java.lang.Math.abs(b[y].intelligence - g[i].intelligence)+ java.lang.Math.abs(b[y].attractiveness -g[i].attractiveness);

                        }
                      if(g[z].type == 2){
                          int u = c[i].gift_price/g[z].maintenance;
                          g[z].happiness = (int) java.lang.Math.exp(u);
                           c[i].happiness =  g[z].happiness + b[y].happiness;
                           c[i].compatibility =  java.lang.Math.abs(b[y].budget-g[z].maintenance)+ java.lang.Math.abs(b[y].intelligence - g[i].intelligence)+ java.lang.Math.abs(b[y].attractiveness -g[i].attractiveness);

                      }
                      if(g[z].type == 3){
                          g[z].happiness = (c[i].gift_price )/g[z].maintenance;
                           c[i].happiness =  g[z].happiness + b[y].happiness;
                           c[i].compatibility =  java.lang.Math.abs(b[y].budget-g[z].maintenance)+ java.lang.Math.abs(b[y].intelligence - g[i].intelligence)+ java.lang.Math.abs(b[y].attractiveness -g[i].attractiveness);
                          
                        }
                }
              if(b[y].type == 2){
                   System.out.println("boy id " +b[y].name +"  girl id "+ g[z].name +" ");
                  while(c[i].gift_price <= b[y].budget){
                       rand r = new rand();
                       int k= r.getRandomNumberInRange(1,50);
                       
                       if(search(k,q,w) == 0 ) {
                           continue;
                       }
                       q[w]=k;
                       w++;
                        c[i].gift_price += gi[k].price;
                        System.out.println(gi[k].price + " " + gi[k].value);
                    
                    }
                    if( g[z].type == 1){
                           int u = c[i].gift_price/g[z].maintenance;
                           g[z].happiness =  (int) java.lang.Math.log(u);
                           b[z].happiness =  g[z].happiness;
                           c[i].happiness =  g[z].happiness + b[y].happiness;
                           c[i].compatibility =  java.lang.Math.abs(b[y].budget-g[z].maintenance)+ java.lang.Math.abs(b[y].intelligence - g[i].intelligence)+ java.lang.Math.abs(b[y].attractiveness -g[i].attractiveness);
                           
                    }
                    if(g[z].type == 2){
                          int u = c[i].gift_price/g[z].maintenance;
                          g[z].happiness = (int) java.lang.Math.exp(u);
                           b[z].happiness =  g[z].happiness;
                           c[i].happiness =  g[z].happiness + b[y].happiness;
                           c[i].compatibility =  java.lang.Math.abs(b[y].budget-g[z].maintenance)+ java.lang.Math.abs(b[y].intelligence - g[i].intelligence)+ java.lang.Math.abs(b[y].attractiveness -g[i].attractiveness);

                    }
                    if(g[z].type == 3){
                          g[z].happiness = (c[i].gift_price )/g[z].maintenance;
                           b[z].happiness =  g[z].happiness;
                           c[i].happiness =  g[z].happiness + b[y].happiness;
                           c[i].compatibility =  java.lang.Math.abs(b[y].budget-g[z].maintenance)+ java.lang.Math.abs(b[y].intelligence - g[i].intelligence)+ java.lang.Math.abs(b[y].attractiveness -g[i].attractiveness);

                   }
             }
              if(b[y].type == 3) {
                   System.out.println("boy id " +b[y].name +"  girl id "+ g[z].name +" ");
                  while(c[i].gift_price <= g[z].maintenance){
                       rand r = new rand();
                       int k= r.getRandomNumberInRange(1,50);
                       
                       if(search(k,q,w) == 0 ) {
                           continue;
                       }
                       q[w]=k;
                       w++;
                        c[i].gift_price += gi[k].price;
                        System.out.println(gi[k].price + " " + gi[k].value);
                    
                    }
                  b[y].happiness = b[y].budget - c[i].gift_price;
                      if( g[z].type == 1){
                           int u = c[i].gift_price/g[z].maintenance;
                           g[z].happiness =  (int) java.lang.Math.log(u);
                           c[i].happiness =  g[z].happiness + b[y].happiness;
                           c[i].compatibility =  java.lang.Math.abs(b[y].budget-g[z].maintenance)+ java.lang.Math.abs(b[y].intelligence - g[i].intelligence)+ java.lang.Math.abs(b[y].attractiveness -g[i].attractiveness);
                        }
                      if(g[z].type == 2){
                          int u = c[i].gift_price/g[z].maintenance;
                          g[z].happiness = (int) java.lang.Math.exp(u);
                           c[i].happiness =  g[z].happiness + b[y].happiness;
                           c[i].compatibility =  java.lang.Math.abs(b[y].budget-g[z].maintenance)+ java.lang.Math.abs(b[y].intelligence - g[i].intelligence)+ java.lang.Math.abs(b[y].attractiveness -g[i].attractiveness);
                      }
                      if(g[z].type == 3){
                          g[z].happiness = (c[i].gift_price )/g[z].maintenance;
                           c[i].happiness =  g[z].happiness + b[y].happiness;
                           c[i].compatibility =  java.lang.Math.abs(b[y].budget-g[z].maintenance)+ java.lang.Math.abs(b[y].intelligence - g[i].intelligence)+ java.lang.Math.abs(b[y].attractiveness -g[i].attractiveness);
                        }
                }
        }
        System.out.println("girl " + "boy " + "happiness");
        int max = 1000000;
        int k = 0;
        for(int s = 1;s<=10;s++) {
            int maxi = -1;
            for(i =1;i<=15;i++) {
                if(c[i].happiness > maxi && c[i].happiness <max){
                    maxi = c[i].happiness;
                    k = i;
                   
                }
            }
            int y = searchb(c[k],b);
            int z = searchg(c[k],g);
            System.out.print(g[z].name +" "+ b[y].name);
            System.out.println(" " + maxi);
            max = maxi;
        }
         System.out.println("girl " + "boy  " + "happiness");
         max = 1000000;
         k = 0;
        for( int s = 1;s<=10;s++) {
            int maxi = -1;
            for(i =1;i<=15;i++) {
                if(c[i].compatibility > maxi && c[i].compatibility <max){
                    maxi = c[i].compatibility;
                    k = i;
                   
               }
            }
            int y = searchb(c[k],b);
            int z = searchg(c[k],g);
            System.out.print(g[z].name +" "+ b[y].name);
            System.out.println(" " + maxi);
            max = maxi;
        }
    }
      
   static int  searchb(couple d,boy[] b){
        int i;
        for(i=1;i<=20;i++){
            if(d.boy_id == b[i].name){
                return i;
            }
        } 
        return 0;
    }
   static int  searchg(couple d,girl[] g){
        int i;
        for(i=1;i<=15;i++){
            if(d.girl_id == g[i].name){
                return i;
            }
        } 
        return 0;
    }
    static int search (int j ,int[] k,int w){
        int i;
        for(i=1;i<w;i++){
            if(k[i] == j){
                return 0;
            }
        }
        return 1;
    }
}
      
        

