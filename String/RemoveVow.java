import java.util.*;
public class RemoveVow{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String res= "";
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if("aeiouAEIOU".indexOf(ch) == -1){
                 res = res + ch;
            }
        }
        System.out.println(res);
    }
}