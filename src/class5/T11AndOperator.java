package class5;

import java.util.Scanner;

public class T11AndOperator {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter person height");
        double height=scanner.nextDouble();

        if (height<=60){
            System.out.println("short");

        } else if (60 <= height &&height<=72) {
            System.out.println("medium");

        }else if(height>72){
            System.out.println("tall");
        }

    }

    }

