import java.util.*;
public class RemoveVow{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String str = new String();
        str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch= Character.toLowerCase(str.charAt(i));
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                 System.out.print(ch);
            }
        }
        sc.close();
    }
}