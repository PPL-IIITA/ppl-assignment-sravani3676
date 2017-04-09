package q4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Q4 {

    public static void main(String[] args) throws IOException {
         PrintStream out = new PrintStream(new FileOutputStream("out1.txt"));
         System.setOut(out);
       
         int i=1;
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
        make_couple.make(g,b,gi,c);
        for(i=1;i<=15;i++){
            System.out.print(c[i].girl_id );
            System.out.println(" " +c[i].boy_id );
        }
        breakup.breaku(g,b,c);
        System.out.println("After Breakup");
        make_couple.make(g,b,gi,c);
       /* for(i=1;i<=15;i++){
            System.out.print(c[i].girl_id);
            System.out.println(" " +c[i].boy_id );
        }*/
    }
    
}
