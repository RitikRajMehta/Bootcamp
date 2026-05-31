import java.util.*;
public class Replace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str1 = sc.nextLine();

        char replace = sc.next().charAt(0);

        String result = str.replace(str1, String.valueOf(replace));
        System.out.println(result);
    }
}