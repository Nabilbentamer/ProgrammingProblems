package codeforces;
import java.util.Scanner;

public class ProgrammingProblems {

    /**
     * @param args the command line arguments
     */
public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        for (int i = 0; i < length; i++) {

            String word = scanner.next();
            int n = word.length();

            if (n > 10) {
                int a = n - 2;
                System.out.print(word.charAt(0));
                System.out.print(a);
                System.out.println(word.charAt(n - 1));

            } else {

                System.out.println(word);
            }

        }

        scanner.close();
    }
    
}
