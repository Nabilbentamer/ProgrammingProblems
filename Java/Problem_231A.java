package codeforces;
import java.util.*;

public class Problem_231A {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        int length = input.nextInt();
        int j=0;
        for(int i=0;i<length;i++){
            
            
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            
            if(a==1){
                if(b==1 || c==1){
                    j++;
                }
            }
            else if(b==1){
                if(c==1){
                    j++;
                }
            }

            
        }
        
        System.out.println(j);
    }
    
}
