package class10;
import java.util.Scanner;
public class Username {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter username :");
        String username=scanner.nextLine();
        System.out.print("please enter password :");
        String password=scanner.nextLine();
        String realusername="yavuz";
        String realpassword="123yvz";
        if(username.isEmpty()||password.isEmpty()){
            System.out.println("Username and Password cannot be empty");
        } else if (password.length()>=8) {
            System.out.println("password is too short");
        }else if (password.contains(username)){
            System.out.println("password cannot contain username");
        } else if (!password.equals(realpassword)) {
            System.out.println("password do not match");

        }else {
            System.out.println("your username and password has been created");
        }
    }
}
