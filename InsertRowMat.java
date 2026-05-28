import java.util.*;
public class InsertRowMat{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns:");
        int c = sc.nextInt();
        int [][] mat = new int [r][c];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the row to be inserted:");
        int row = sc.nextInt();
        System.out.println("Enter the elements of the row:");
        int [] newRow = new int [c];
        for(int i=0;i<c;i++){
            newRow[i] = sc.nextInt();
        }
        for(int i=r-1;i>=row;i--){
            for(int j=0;j<c;j++){
                mat[i][j] = mat[i-1][j];
            }
        }
        for(int j=0;j<c;j++){
            mat[row][j] = newRow[j];
        }
        System.out.println("Matrix after inserting the row:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
} 