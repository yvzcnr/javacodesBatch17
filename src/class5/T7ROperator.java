package class5;

import java.util.Scanner;

public class T7ROperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your birthday mouth");
        String birthMouth=scanner.nextLine();


        if (birthMouth.equals("march")||birthMouth.equals("april")|| birthMouth.equals("may")){
            System.out.println("you were born is season spring");}
        else if (birthMouth.equals("june")||birthMouth.equals("july")|| birthMouth.equals("aug")){
            System.out.println("you were born is season summer");}


    }
}
