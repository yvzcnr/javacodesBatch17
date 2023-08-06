package class5;

import java.util.Scanner;

public class E3NotOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the name of the country");
        String country=scanner.nextLine();

        if (!country.equalsIgnoreCase("ıran")){
            System.out.println("welcome you are allowed");
        }else {
            System.out.println("you are not allowed");
        }
    }
}
