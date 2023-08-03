package homework;

import java.util.Scanner;

public class LoanSpecialist {
    public static void main(String[] args) {
        System.out.println("welcome to our bank");
        System.out.print("please access your needed loan:");
        Scanner scanner=new Scanner(System.in);
        double loan=scanner.nextDouble();

        if (loan<=200000){
            System.out.println(" congratulation!!your loan is İN your account");}
            else{
                System.out.println("please try again later");
            }
        }
    }


