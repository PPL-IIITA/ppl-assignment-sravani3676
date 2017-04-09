package q4;

import java.io.IOException;
public class make_couple {
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
            for( int j=1; j<=20; j++) {
            if(b[j].type == 1){
                b[j] = new greeky_boy(j+23435);
            } 
            if(b[j].type == 2){
                b[j]=new generous_boy(j+23435);
            }
            if(b[j].type == 3){
                b[j] = new miser_boy(j+23435);
            }
       }
            for(i= 1;i<15;i++) {
                rand r = new rand();
                int j= r.getRandomNumberInRange(1,20);
                //int j = k-23435;
                if(g[i].type == 1 && g[i].paired == 0){
                    if(g[i].maintenance  <= b[j].budget && b[j].booked == 0 && b[j].attractiveness >= 6){
                        System.out.println( g[i].name +" paired with " +b[j].name);
                        b[j].booked = 1;
                        g[i].paired = 1;
                        //System.out.print(l);
                        c[i].boy_id = j+23435;
                         //System.out.println(c[l].boy_id);
                        c[i].girl_id = i;
                        l++;
                    }
                }
                if(g[i].type == 2  && g[i].paired == 0){
                    if(g[i].maintenance  <= b[j].budget && b[j].booked == 0 && b[j].budget  >= 35000){
                         System.out.println( g[i].name +" paired with " +b[j].name);
                        b[j].booked = 1;
                        g[i].paired = 1;
                        c[i].boy_id = j+23435;
                        // System.out.println(c[l].boy_id);
                        c[i].girl_id = i;
                        l++;
                    }
                }
                if(g[i].type == 3  && g[i].paired == 0){
                    if(g[i].maintenance  <= b[j].budget && b[j].booked == 0 && b[j].attractiveness >= 5&& b[j].intelligence >=300 ){
                        System.out.println( g[i].name +" paired with " +b[j].name);
                        b[j].booked = 1;
                        g[i].paired = 1;
                        c[i].boy_id = j+23435;
                        //System.out.println(c[l].boy_id);
                        c[i].girl_id = i;
                        l++;
                    }
                }
                
                //System.out.println(c[l].boy_id)
            }
            
            for(i=1;i<=15;i++) {
                if(g[i].paired == 0){
                    for(int j = 1;j<=20;j++){
                        if(b[j].booked == 0){
                            System.out.println( g[i].name +" paired with " +b[j].name);
                            b[j].booked = 1;
                            g[i].paired = 1;
                            c[i].boy_id = j+23435;
                           // System.out.println(c[l].boy_id);
                            c[i].girl_id = i;
                            l++;
                            break;
                        }
                    }
                }
            }
            System.out.println("Details of gifts price and value");
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
        
       /*int max = 1000000;
        for(int s = 1;s<=10;s++) {
            int maxi = -1;
            for(i =1;i<=15;i++) {
                if(c[i].happiness > maxi && c[i].happiness <max){
                    maxi = c[i].happiness;
                   
                }
            }
            System.out.println(maxi);
            max = maxi;
        }
         max = 1000000;
        for( int s = 1;s<=10;s++) {
            int maxi = -1;
            for(i =1;i<=15;i++) {
                if(c[i].compatibility > maxi && c[i].compatibility <max){
                    maxi = c[i].compatibility;
                   
                }
            }
            System.out.println(maxi);
            max = maxi;
        }*/
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
