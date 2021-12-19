package codeforces;
import java.util.*;

public class Porblem_1A {
    
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        long n= input.nextInt();
        long m = input.nextInt();
        long a = input.nextInt();
        
        long height_needed=0;
        long width_needed=0;
        

        if(n%a==0){
            height_needed=n/a;
        }
        
        else{
            height_needed=n/a +1;
        }
        
            if(m%a==0){
                width_needed=m/a;
            }
            else{
                width_needed=m/a +1;
            }

        

        System.out.print(height_needed*width_needed);
        
        
        
    } 
   
}
