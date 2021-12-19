package codeforces;
import java.util.*;
/**
 *
 * @author hp
 */
public class Bit {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int x=0;
        for(int i=0;i<n;i++){
            
            String statement = input.next();
            if(statement.contains("++")){
                x++;
            }
            else{
                x--;
            }
            
        }
        
        System.out.println(x);
    }
    
}
