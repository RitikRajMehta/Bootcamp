import java.util.*;
public class PasswordGen{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String user = sc.nextLine();
        String pass = sc.nextLine();

        String password = user.substring(0,5)+pass.substring(pass.length()-4);
        System.out.println(password);
    }
}