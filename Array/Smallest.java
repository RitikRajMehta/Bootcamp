import java.util.*;
public class Smallest{
    public static int getSmallest(int nums[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(smallest>nums[i]){
                smallest=nums[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Smallest Number is:" + getSmallest(nums));
    }
}