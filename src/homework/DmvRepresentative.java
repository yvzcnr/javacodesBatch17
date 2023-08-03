package homework;

import java.util.Scanner;


public class DmvRepresentative {
    public static void main(String[] args) {
        System.out.println("WELCOME");
        System.out.print("WHAT İS YOUR AGE: ");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        if (age>18){
            System.out.println("you are too big thank you");
        }else {
            System.out.println("!!Congratulation!! You can register our system");
        }
    }
}
