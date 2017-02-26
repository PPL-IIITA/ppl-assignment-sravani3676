package main;
import java.util.*;
import java.io.*;
//import java.io.FileWriter; 
//import java.io.FileReader;
import java.io.IOException;
 
public class main {
    public static void main(String[] args) throws IOException {  
    girl[] g = new girl[15];
    boy[] b = new boy[20];
    for(int i=0;i<15;i++){
        g[i] = new girl(i);
    }
   // System.out.println(g[1].attractiveness);
    int j,k=50;
    for( j=0;j<20;j++){
        b[j] = new boy(k);
        k++;
    } 
  // System.out.println(b[6].name);
    q_1.q(g,b);
   // System.out.println(b[3].valantine);
   }
}
