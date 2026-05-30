import java .util.*;
public class DiffFirstLast{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Elements:");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[0]-arr[n-1]);
    }
}