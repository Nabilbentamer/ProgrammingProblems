package codeforces;
import java.util.*;


public class Pleasant_Pairs_TimeOptimized {
    
    
    /*public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int a[] = new int[300000];
        int count=0;
        
        while(t>0){
            t--; 
            int n = input.nextInt();
            for(int i=0;i<n;i++){
                a[i]=input.nextInt();
            }
        }
    }*/
    
    public static void main (String[] args) throws Exception{
        int []a = new int[300000];
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int n = sc.nextInt();
            int  count = 0;
            for(int j = 1; j<=n; j++){
                a[j] = sc.nextInt();
                //int r = a[j]-j%a[j];
                for(int i =1; i<j; i++)
                    if(j+i == a[j]*a[i]) count++;
            }
            System.out.println(count);
        }
    }
    
    
    
}
