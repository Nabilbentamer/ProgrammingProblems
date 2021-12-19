package codeforces;
import java.util.*;

public class Problem_158A {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        int participants_number = input.nextInt();
        int k_place = input.nextInt();
        
        int participants_next=0;
        for(int i=0; i<participants_number;i++){
            int a = input.nextInt();
            
            if(a>k_place){
                participants_next++;
            }
            else if(a==k_place){
                for(int b=0; b<participants_number;b++){
                    
                    
                }
            }
        }
        
        System.out.println(participants_next);
        
    }
    
    
    
}
