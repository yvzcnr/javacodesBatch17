package class5;

import java.util.Scanner;

public class T3AndOperator {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter day");
        double day=scanner.nextDouble();

        if (day==1||day==2||day==3||day==4||day==5){
            System.out.println("weekday");}
        else if (day==6||day==7){
            System.out.println("weekday");}
        else{
        System.out.println("invalid day");
    }

    }}

