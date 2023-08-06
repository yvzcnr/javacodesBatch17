package class5;

import java.util.Scanner;

public class T10Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a country");
        String country=scanner.nextLine();

        switch (country){
            case "england":
                System.out.println("english");
                break;
            case "portugal":
                System.out.println("portugues");
                break;
            case "turkey":
                System.out.println("turkish");
                break;
            case "spain":
                System.out.println("spanish");
                break;
            case "holland":
                System.out.println("flemenk");
                break;
            default:
                System.out.println("invalid");

        }
    }
}
