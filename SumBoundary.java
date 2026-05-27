import java.util.Scanner;
public class SumBoundary{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size of the matrix: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Sum of boundary elements:");
        for(int i=0;i<m;i++){
            for(int j=0;i<n;j++){
                if(i==0 || i==m-1 || j==0 || j==n-1){
                    System.out.print(matrix[i][j]);
                }else{
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}