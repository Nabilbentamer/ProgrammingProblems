package codeforces;
import java.util.*;


public class Pleasant_Pairs {
    

    public static void main(String args[]){
        
            Scanner input = new Scanner(System.in);
            int t = input.nextInt();
            ArrayList<Integer> ourArray = new ArrayList<Integer>();
            
            
            for(int i=0; i<t; i++){
                
                
                int length = input.nextInt();
                for(int j=0; j<length;j++){
                    int element = input.nextInt();
                    ourArray.add(element);
                }
                
                int j=1;
                int reference=ourArray.get(1);
                int count_pairs=0;
                
                while(j<length){
                    
                    for(int k=0;k<j;k++){
                    if(ourArray.get(k)*ourArray.get(j)== k+j){
                        count_pairs++;
                    }
                }
                    j++;
                    
                }

                
                System.out.println(count_pairs+1);
                
    
        }
        
    }
    
}
