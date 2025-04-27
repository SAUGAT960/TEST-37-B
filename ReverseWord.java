import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        StringBuilder reversed = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }

        System.out.println("Reversed word: " + reversed);

        scanner.close();
    }
}


