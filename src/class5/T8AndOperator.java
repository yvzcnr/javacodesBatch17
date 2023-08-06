package class5;

import java.util.Scanner;

public class T8AndOperator {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter number");
        double number=scanner.nextDouble();

        if (1 <= number &&number<=10){
            System.out.println("small number");

        } else if (11 <= number &&number<=100) {
            System.out.println("medium number");

        }else if(101 <= number &&number<=1000){
            System.out.println("tall number");
        }

    }

    }

