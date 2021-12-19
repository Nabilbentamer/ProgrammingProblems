package codeforces;
import java.util.*;
import java.lang.*;

public class Problem_263A {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        int i,j=0;
        int[][] matrice = new int[5][5];
        int newi=0,newj=0;
        
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                int c = input.nextInt();
                matrice[i][j]=c;
                if(c==1){
                    newi=i;
                    newj=j;
                    break;
                }
                
            }
        }
        
        int result = Math.abs(newi-2)+ Math.abs(newj-2);
        System.out.println(result);
        
        
        
    }
    
}
