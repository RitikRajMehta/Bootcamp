import java.util.Scanner;

class PrefixSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int[] prefix = new int[n];

        prefix[0] = a[0];

        for (int i = 1; i < n; i++)
            prefix[i] = prefix[i - 1] + a[i];

        for (int i = 0; i < n; i++)
            System.out.print(prefix[i] + " ");

        sc.close();
    }
}