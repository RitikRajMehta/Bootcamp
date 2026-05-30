import java.util.*;
public class Replace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char oldChar = sc.next().charAt(0);
        char newChar = sc.next().charAt(0);

        String res = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == oldChar){
                res = res + newChar;
            } else {
                res = res + ch;
            }
        }
        System.out.println(res);
    }
}