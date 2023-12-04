import java.lang.String;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.next().toLowerCase();
        String b = "";

        for(int i = word.length()-1; i>=0 ; i--){
            char w = word.charAt(i);
            b = b + w;

    }
        if (word.equals(b)) {
            System.out.println("The entered word is a palindrome.");
        } else {
            System.out.println("The entered word is not a palindrome.");
        }

    }
}
