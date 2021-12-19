package codeforces;
import java.util.*;


public class Problem_112A {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        String s1 = input.next().toLowerCase();
        String s2 = input.next().toLowerCase();
        char c1,c2;
        

        
        for(int i=0; i<s1.length();i++){
            
        if(s1.equals(s2)){
            System.out.println(0);
            break;
        }
            if(s1.charAt(i)>s2.charAt(i)){
                System.out.println(1);
                break;
            }
            
            if(s1.charAt(i)<s2.charAt(i)){
                System.out.println(-1);
                break;
            }
    
        }

    }
    
}
