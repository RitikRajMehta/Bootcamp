// Rotate a String by a given number of characters and then invert the case of each character.
import java.util.*;
public class RotateInvert{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = sc.nextInt();
        String rotated = rotate(str, n);
        String inverted = invertCase(rotated); 
        System.out.println(inverted);
    }
    public static String rotate(String str, int n){
        n = n % str.length(); // Handle cases where n is greater than string length
        return str.substring(n) + str.substring(0, n);
    }
    public static String invertCase(String str){
        StringBuilder result = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(Character.toUpperCase(ch));
            }
        }
        return result.toString();
    }
}