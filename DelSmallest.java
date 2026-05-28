import java.util.Scanner;

class DelSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int min = a[0], pos = 0;

        for (int i = 1; i < n; i++) {

            if (a[i] < min) {
                min = a[i];
                pos = i;
            }
        }

        for (int i = pos; i < n - 1; i++)
            a[i] = a[i + 1];

        for (int i = 0; i < n - 1; i++)
            System.out.print(a[i] + " ");

        sc.close();
    }
}