import java.util.Scanner;

public class Sum_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        String digit = sc.nextLine();
        int sum = 0;

        for (int i = digit.length() - 1; i >= 0; i--) {
            char a = digit.charAt(i);
            int digitValue = Character.getNumericValue(a);
            sum += digitValue;
        }

        System.out.println("The sum of digits is " + sum);
    }
}