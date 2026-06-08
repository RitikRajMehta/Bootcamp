import java.util.*;

public class SubArray {
    public static void printSubarrays(int num[]) {
        int total = 0;

        for(int i = 0; i < num.length; i++) {
            for(int j = i; j < num.length; j++) {
                for(int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total Subarrays = " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        printSubarrays(num);
    }
}