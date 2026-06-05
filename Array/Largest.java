import java.util.*;
public class Largest{
    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int num[]=new int[n];
       for(int i=0;i<n;i++){
           num[i] = sc.nextInt();
       }
       System.out.println("Largest element is: "+getLargest(num));
    }    
}