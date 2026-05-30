import java.util.*;
public class Vowelcons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isConsonant(ch)) {
                count++;
            }
        }

        System.out.println("Number of consonants: " + count);
    }

    private static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch >= 'a' && ch <= 'z') && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}