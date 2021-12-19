package codeforces;
import java.util.*;


public class String_Task {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        String ourString = input.next();
        String newString = ourString.toLowerCase();
        
        StringBuilder result = new StringBuilder();
        int j=0;
        for(int i=0;i<newString.length();i++){
            
            if(isVowles(newString.charAt(i))==false){
                
                result.append('.');
                result.append(newString.charAt(i));
                j=j+2;
                
            }
        }
        
        System.out.println(result.toString());
        
    }
    
    

    static boolean isVowles(char c){
        
        char[] vowles = {'a', 'o', 'y', 'e', 'u', 'i'};
        
        for(char x : vowles){
            if(x==c){
                return true;
            }
            
        }
        
        
        return false;
    }
    
}
