package homework;

import java.util.Scanner;

public class CreditCart {
    public static void main(String[] args) {
        System.out.println("have you had a credit card?true or false: ");
        Scanner scanner=new Scanner(System.in);
        boolean havingCreditCard=scanner.nextBoolean();
        if (havingCreditCard==true){
            System.out.println("what is balance on the card?: ");
            double balance=scanner.nextDouble();
            if (balance>=1000){
                System.out.println("please  pay off immediately");
            }else {
                System.out.println("be cool you can spend more");
            }
        }else {
            System.out.println("please take a credit card immediately");
        }
    }
}
