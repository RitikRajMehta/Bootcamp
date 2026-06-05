import java.util.*;
public class Reverse{
    public static int[] reverse(int nums[]){
    int first=0,last=nums.length-1;


        while(first<last){
            int temp=nums[last];
            nums[last]=nums[first];
            nums[first]=temp;

            first++;
            last--;
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        reverse(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}