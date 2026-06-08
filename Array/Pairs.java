import java.util.*;

public class Pairs {

    public static void printPairs(int nums[]) {
        int tp = 0;

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + curr + "," + nums[j] + ")");
                tp++;
            }

            System.out.println();
        }

        System.out.println("Total Number of Pairs = " + tp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        printPairs(nums);
    }
}