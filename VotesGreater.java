import java.util.Scanner;

class VotesGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int limit = n / 4;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (a[i] == a[j])
                    count++;
            }

            if (count > limit) {

                boolean printed = false;

                for (int k = 0; k < i; k++) {
                    if (a[k] == a[i])
                        printed = true;
                }

                if (!printed)
                    System.out.print(a[i] + " ");
            }
        }

        sc.close();
    }
}