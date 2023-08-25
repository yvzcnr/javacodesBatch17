package review4;

import java.util.Arrays;
import java.util.Scanner;

public class E3Array {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=scanner.nextInt();
        int [] numbers=new int [size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("please enter the number "+i);
            numbers [i]= scanner.nextInt();
        }
        System.out.println("you entered this numbers");
        System.out.println(Arrays.toString(numbers));
    }}
