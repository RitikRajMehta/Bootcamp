import java.util.*;
public class InsDelRowColPos{
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
        int r=sc.nextInt();
        int c=sc.nextInt();
        int pos=sc.nextInt();
        if(pos==1){
            for(int i=m-1;i>r-1;i--){
                for(int j=0;j<n;j++){
                    mat[i][j]=mat[i-1][j];
                }
            }
            for(int j=0;j<n;j++){
                mat[r-1][j]=0;
            }
        }else if(pos==2){
            for(int i=r-1;i<m-1;i++){
                for(int j=0;j<n;j++){
                    mat[i][j]=mat[i+1][j];
                }
            }
            for(int j=0;j<n;j++){
                mat[m-1][j]=0;
            }
        }else if(pos==3){
            for(int j=n-1;j>c-1;j--){
                for(int i=0;i<m;i++){
                    mat[i][j]=mat[i][j-1];
                }
            }
            for(int i=0;i<m;i++){
                mat[i][c-1]=0;
            }
        }else if(pos==4){
            for(int j=c-1;j<n-1;j++){
                for(int i=0;i<m;i++){
                    mat[i][j]=mat[i][j+1];
                }
            }
            for(int i=0;i<m;i++){
                mat[i][n-1]=0;
            }
        }else{
            System.out.println("Invalid Position");
        }
        System.out.println("Updated Matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}