import java.util.Scanner;

public class Consonent_name {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name: ");
            String Name = scanner.nextLine();


            int vowel = 0;
            int consonant = 0;

            String Vowels = "aeiou";

            for (int i = 0; i < Name.length(); i++){
                char Cons = Name.charAt(i);

                if (Character.isLetter(Cons)){
                    if (Vowels.contains(String.valueOf(Cons))){
                        vowel++;
                    }else {
                        consonant++;
                    }
                }
            }
            System.out.println("The consonant are "+consonant);
            System.out.println("The vowel are "+vowel);
        }
    }

