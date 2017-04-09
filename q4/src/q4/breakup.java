/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

import java.io.IOException;

/**
 *
 * @author sravani
 */
public class breakup {
   static void breaku(girl[] g,boy[] b,couple[] c)throws IOException {
         int min = -1;
         int p  = 0;
        for(int s = 1;s<=10;s++) {
            int maxi = 100000;
            for(int i =1;i<=15;i++) {
                if(c[i].happiness < maxi && c[i].happiness >min){
                    maxi = c[i].happiness;
                    p = i;
                   
                }
            }
            //System.out.println(maxi);
            int y = searchb(c[p],b);
            b[y].booked = 0;
            c[p].boy_id = 0;
            int z = searchg(c[p],g);
            g[z].paired = 0;
            c[p].girl_id = 0;
            min = maxi;
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
}
