 
package q3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import  java.lang.NullPointerException;
public class Q3 {
    public static void main(String[] args) throws IOException {
        int i=1;
        PrintStream out = new PrintStream(new FileOutputStream("out.txt"));
               System.setOut(out);
        girl[] g = new girl[16];
        boy[] b = new boy[21];
        gifts[] gi = new gifts[51];
        for( i = 1;i<=15;i++) {
            g[i] = new girl(i);
        }
        int j;
        i=0;
        for(j=1; j<=20; j++) {
            b[j] = new boy(j+23435);
        }
        for(i=1;i<=50;i++){
            gi[i] = new gifts();
        }
      
        
        couple[] c = new couple[16];
        for(int p = 1;p <= 15;p++){
                c[p] = new couple();
            }
          make_Couple.make(g,b,gi,c);
        /*for(i=1;i<=15;i++){
            System.out.println(c[i].happiness);
        }*/
        
    }
    
}
