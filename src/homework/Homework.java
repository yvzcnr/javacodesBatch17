package homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your city:");
        String city=scanner.nextLine();
        System.out.println("please enter temperature in Fahrenheit: ");
        double temperature=scanner.nextDouble();
        double celcius=(temperature-32)/180;
        System.out.println("The temperature is "+city+" is "+celcius+"C");

    }
}
