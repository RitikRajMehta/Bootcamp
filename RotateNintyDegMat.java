import java.util.*;
public class RotateNintyDegMat{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][] mat= new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        int [][] rotMat= new int [n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                rotMat[j][m-1-i]=mat[i][j];
            }
        }
        System.out.println("Rotated Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(rotMat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}