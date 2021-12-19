package codeforces;
import java.util.*;
import java.lang.*;



public class Problem_281A {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        String s = input.next();
        char e = Character.toUpperCase(s.charAt(0));
        
        StringBuilder result = new StringBuilder(s);
        result.setCharAt(0,e);
        
        System.out.println(result.toString());
    }
}
