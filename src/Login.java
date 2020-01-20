import java.util.ArrayList;
import java.util.Scanner;

public class Login extends Main{
    public static int login(ArrayList<String> adminList, ArrayList<String> regUserList, int loginType) {
        String userName;
        String passWord;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter username");
        userName = scan.next();
        System.out.println("Please enter password");
        passWord = scan.next();

        if (loginType == 1) {
            for (int i = 0; i < adminList.size(); i++) {
                if (userName.equals(adminList.get(i)) && passWord.equals(adminList.get(i + 1))) {
                    System.out.println("Success! You are now logged in as Admin");
                    return 1;
                }
            }
        } else if (loginType == 2) {
            for (int i = 0; i < regUserList.size(); i++) {
                if (userName.equals(regUserList.get(i)) && passWord.equals(regUserList.get(i + 1))) {
                    System.out.println("Success! You are now logged in as a regular user.");
                    return 1;
                }
            }
        }
        System.out.println("You have either logged in with the wrong credentials or attempted to login as a user you are not, i.e. attempted to login as Admin when you are not.");
        return 0;
    }
}
