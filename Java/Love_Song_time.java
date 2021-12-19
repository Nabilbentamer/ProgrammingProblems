package codeforces;
import java.util.*;


public class Love_Song_time {
    
    public static void main (String args[]){
        
        Scanner input = new Scanner(System.in);
    
        int n = input.nextInt();
        int q = input.nextInt();
        String song = "$"+input.next();

        char[] song_asArray = song.toCharArray();
        long[] song_length = new long[n+1];
        
        song_length[0]= 0;
        song_length[1]= song_asArray[1]-'a'+1;

        
        for(int i=2;i<=n;i++){
            
            song_length[i]=song_length[i-1] + (song_asArray[i]-'a' +1) ;
            
        }

        for(int j=0;j<q;j++){
            
            int l = input.nextInt();
            int r = input.nextInt();
            
            System.out.println(song_length[r]-song_length[l-1]);
        }

        
        
    }
    
    
   
   
    
}
