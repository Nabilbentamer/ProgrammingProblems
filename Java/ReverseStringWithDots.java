package codeforces;
import com.sun.org.apache.xml.internal.security.Init;

import java.util.Scanner;

public class ReverseStringWithDots {



    public static void main(String[] args){

        while(true){
            Scanner input = new Scanner(System.in);

            String InitString = input.next();
            int n = InitString.length();
            String reversed = "";

            for(int i=0;i<n;i++){
                char a =InitString.charAt(n-i-1);
                reversed = reversed + a;

            }
            String reversedString="";
            int start =0;
            for(int i=0;i<n;i++){


                String singleword;
                int end=0;
                if(reversed.charAt(i) == '.'){

                    end=i;
                    singleword=reverseSingleWord(reversed.substring(start,end));

                    reversedString = reversedString +singleword+'.';
                    start = i+1;
                }
                if(i==n-1){
                    reversedString = reversedString + reverseSingleWord(reversed.substring(start,n));
                }

            }
            System.out.println(reversedString);

        }




    }

    static String reverseSingleWord(String word){

        String SingleWord = "";
        String reversedWord ="";
        int m= word.length();

        int i=0;
        while(i<m){
            reversedWord = reversedWord + word.charAt(m-i-1);
            i++;

        }
        return reversedWord;
    }
}
