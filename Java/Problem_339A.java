package codeforces;
import java.util.*;

public class Problem_339A {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        String s = input.next();
        String[] foo = s.split("\\+");
        Arrays.sort(foo);
        StringBuilder result = new StringBuilder();
        int i;
        for(i=0;i<foo.length-1;i++){
            result.append(foo[i]);
            result.append("+");
                             
        }
        if(i==foo.length-1){
            result.append(foo[i]);            
        }
        
        System.out.println(result.toString());
        
        
        
        
        
        
    }
    
}
