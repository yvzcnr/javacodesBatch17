package class6;

import java.util.Scanner;

public class E10WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the starting point: ");
        int start=scanner.nextInt();
        int end=10;
        int step=1;
        while (start<=end){

            System.out.print(" "+start+" ");
            start+=step;
        }
    }
}
