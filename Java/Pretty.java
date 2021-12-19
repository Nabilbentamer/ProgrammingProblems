package codeforces;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Pretty {
    
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        int t = input.nextInt();
        
        for(int i=0; i<t;i++){
            
            int n = input.nextInt();
            
            
            if(n%2==0){
                PrintText(n);
                
            }
            
            else{
                PrintText(n-3);
                System.out.print(n);
                System.out.print(" ");
                System.out.print(n-2);
                System.out.print(" ");
                System.out.print(n-1);
                
            }
            
            System.out.print("\n");
            
            
            
           
        }
        
        
    }
    
    public static void PrintText(int n){
                        int j=2;
                
               while(j<=n){
                   
                   System.out.print(j);
                   System.out.print(" ");
                   System.out.print(j-1);
                   System.out.print(" ");
                   
                   j=j+2;
                   
               }
        
        
        
    }
}
