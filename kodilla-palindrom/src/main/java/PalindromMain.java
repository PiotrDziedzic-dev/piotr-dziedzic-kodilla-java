import java.util.Scanner;

public class PalindromMain {
    public static void main(String[] args) {
        String reverse= "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word or number ");
        String word = scanner.nextLine();
        int length = word.length();

        for(int i = length-1; i>=0; i--) {
            reverse = reverse + word.charAt(i);
        }
        if(word.equals(reverse)) {
            System.out.println("Word is palindrome");
        } else {
            System.out.println("Word isn't palindrome");
        }

    }
}
