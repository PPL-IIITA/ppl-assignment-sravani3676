
package main;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.*;
/**
 *
 * @author sravani
 */
public class q_1 {
    static void q(girl[] g,boy[] b) throws IOException{
        PrintStream out = new PrintStream(new FileOutputStream("out.txt"));
               System.setOut(out);
        for(int i=0;i<15;i++) {
            
            if(g[i].criteria == 1){
                for(int j = 0;j<20;j++) {
                    if (b[j].attractiveness > 5 && b[j].booked == 0 && b[j].budget > g[i].maintenance) {
                       System.out.print(b[j].name);
                       System.out.println(" "+g[i].name);
                        b[j].valantine = g[i].name;
                        b[j].booked = 1;
                        g[i].paired = 1;
                        break;
                    }
                }
            }  else if(g[i].criteria == 2){
                for(int j = 0;j<20;j++) {
                    if (b[j].intelligence > 250 && b[j].booked == 0 && b[j].budget > g[i].maintenance) {
                       System.out.print(b[j].name);
                       System.out.println(" "+g[i].name);
                        b[j].booked = 1;
                         b[j].valantine = g[i].name;
                         g[i].paired = 1;
                        break;
                    }
                }
            } else  {
                for(int j = 0;j<20;j++) {
                    if (b[j].budget > 35000 && b[j].booked == 0 && b[j].budget > g[i].maintenance) {
                      System.out.print(b[j].name);
                        
                       System.out.println(" "+g[i].name);
                        b[j].booked = 1;
                         b[j].valantine = g[i].name;
                         g[i].paired = 1;
                         break;
                    }
                }
            } 
        }
        for(int i=0;i<15;i++) {
            if(g[i].paired == 0) {
                for(int j=0;j<20;j++) {
                    if(b[j].booked == 0){
                        System.out.print(b[j].name);
                        
                        System.out.println(" "+g[i].name);
                        b[j].booked = 1;
                         b[j].valantine = g[i].name;
                         g[i].paired = 1;
                         break;
                    }
                }
            }
        }
    }
}
