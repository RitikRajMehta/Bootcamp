import java.util.*;

public class LonCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of strings
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Input strings
        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        // Handle empty input
        if (n == 0) {
            System.out.println("Longest Common Prefix: ");
            return;
        }

        // Find Longest Common Prefix
        String ans = "";

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);

            for (int j = 1; j < n; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    System.out.println("Longest Common Prefix: " + ans);
                    return;
                }
            }

            ans += ch;
        }

        System.out.println("Longest Common Prefix: " + ans);
    }
}