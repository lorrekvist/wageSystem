import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        start();
    }

    protected static void start() {
        ArrayList<String> adminList = new ArrayList<String>();
        ArrayList<String> regUserList = new ArrayList<String>();
        adminList.add(0, "admin1");
        adminList.add(1, "admin1234");
        regUserList.add(0,"madlad");
        regUserList.add(1, "madlad1234");

        Scanner scan = new Scanner(System.in);
        int menuInt = 0;
        int loginType = 0;
        do{

            System.out.print("Welcome, please choose, 1 for Admin login, 2 for Regular user, 3 to Quit.");
            try{
                menuInt = scan.nextInt();
            }
            catch(Exception InputMismatchException){
                System.out.println("Invalid choice. You can only chose either 1 for Admin or 2 for Regular, 3 to Quit.: ");
                if (menuInt == 0) {
                    start();
                }
            }


            switch(menuInt){
                case 1:
                    System.out.println("1 was pressed");
                    loginType = 1;
                    loginType = Login.login(adminList, regUserList, loginType);
                    if(loginType == 1){
                        adminLoggedIn.print();
                    }
                    break;
                case 2:
                    loginType = 2;
                    loginType = Login.login(adminList, regUserList, loginType);
                    System.out.println(loginType);
                    break;
                case 3:
                    System.out.println("Create new account");
                    ArrayList<String> newUser = Register.register();
                    System.out.println(newUser.get(0) + " " + newUser.get(1));
                    regUserList.add(newUser.get(0));
                    regUserList.add(newUser.get(1));
                    break;
                case 4:
                    System.out.println("Thanks for using");
                    menuInt = 4;
                    break;
            }

        }while(menuInt!=4);
    }

}
