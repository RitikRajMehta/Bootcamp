// Compress a string using the counts of repeated characters. For example 3[a]2[bc] would become aaabcbc. You can assume the string is well-formed and does not contain any digits, and that the original data does not contain any digits either. You may also assume the string does not contain any white spaces.
import java.util.*;
public class Comprasion {
    public static String compressString(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int currentNum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + (c - '0');
            } else if (c == '[') {
                stack.push(currentString.toString());
                stack.push(String.valueOf(currentNum));
                currentString.setLength(0);
                currentNum = 0;
            } else if (c == ']') {
                int num = Integer.parseInt(stack.pop());
                String prevString = stack.pop();
                StringBuilder temp = new StringBuilder(prevString);
                for (int i = 0; i < num; i++) {
                    temp.append(currentString);
                }
                currentString = temp;
            } else {
                currentString.append(c);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // Example input: 3[a]2[bc]
        String output = compressString(input);
        System.out.println(output); // Output: aaabcbc
    }
}