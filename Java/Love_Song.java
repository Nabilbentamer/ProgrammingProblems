package codeforces;
import java.util.*;


public class Love_Song {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        int length = input.nextInt();
        int questions_number = input.nextInt();
        
        String song = input.next();
        while(questions_number-- >0){
            
            int starting_sub_song = input.nextInt();
            int ending_sub_song = input.nextInt();
            int new_length=0;
            
            String new_Song = song.substring(starting_sub_song-1, ending_sub_song);
            new_length = new_Song.length();
            
            for(char c : new_Song.toCharArray()){
                new_length+=c-97;
            }

            System.out.println(new_length);
            
            
        }
    }
    
}
