import java.util.Scanner;

public class Firstname_Lastname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First name: ");
        String first = sc.next();
        System.out.println("Enter a Last name: ");
        String last = sc.next();

        String Full_name = first + last;
        System.out.println("Your full_name is "+Full_name);
    }
}

