import java.util.Scanner;

public class Transformed {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = new int[n];

        // Transform the array
        for (int i = 0; i < n; i++) {
            int newIndex = (i + (nums[i] % n) + n) % n;
            result[i] = nums[newIndex];
        }

        // Print transformed array
        System.out.println("Transformed Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}