import java.util.Scanner;

class RevNegRow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        // Negate even index rows
        for (int i = 0; i < r; i += 2)
            for (int j = 0; j < c; j++)
                a[i][j] = -a[i][j];

        // Reverse array
        for (int i = r - 1; i >= 0; i--) {

            for (int j = c - 1; j >= 0; j--)
                System.out.print(a[i][j] + " ");

            System.out.println();
        }

        sc.close();
    }
}