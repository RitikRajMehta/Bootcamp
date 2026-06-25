import java.util.*;
class Missing {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};

        int n = 5;
        int total = n * (n + 1) / 2;

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        System.out.println(total - sum);
    }
}