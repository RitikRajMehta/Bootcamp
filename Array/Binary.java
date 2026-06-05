import java.util.*;
public class Binary{
    public static int binarySearch(int nums[], int key){
        int start=0,end=nums.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            //Comparison
            if(nums[mid]==key){//Found
                return mid;
            }
            if(nums[mid]<key){//right
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println("Key Found at Index at:" + binarySearch(nums , key));
    }
}