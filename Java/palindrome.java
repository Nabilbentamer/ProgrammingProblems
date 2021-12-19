package codeforces;
import java.util.Scanner;
public class palindrome {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String ourString = input.next();

        int n = ourString.length();

        for(int i=0; i<n/2;i++){
            if(ourString.charAt(i)!= ourString.charAt(n-i-1)){

                System.out.println("its not a palindrome");
            }
            else{
                System.out.println("its a palindrome");
                System.out.println();

            }
        }






    }
}
